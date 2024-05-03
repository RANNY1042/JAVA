package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class MemberDatabase {
	public static void main(String[] args) {

		try(Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/.h2/sqlprg", "sa", "abcd")){
			createTable(con, "member");
			createTable(con, "board");

			PreparedStatement psmt1 = null, psmt2 = null;
			Random rand = new Random();
			psmt1 = con.prepareStatement("insert into Member(username, password, birthyear) values(?,?,?);");
			psmt2 = con.prepareStatement("insert into Board(title, content, id, visitcount) values(?,?,?,?);");

			for (int i=1; i<=5; i++) {
				int birth = rand.nextInt(2000, 2011);
				psmt1.setString(1, "user"+i);
				psmt1.setString(2, "pass"+i);
				psmt1.setInt(3, birth);

				int result1 = psmt1.executeUpdate();
				System.out.println("Member 테이블에 "+result1 + "개가 입력되었습니다.");
				for (int j=1; j<=10; j++) {
					int visitcount = rand.nextInt(0, 101);

					psmt2.setString(1, "title"+j);
					psmt2.setString(2, "content"+j);
					psmt2.setInt(3, i);
					psmt2.setInt(4, visitcount);
					int result2 = psmt2.executeUpdate();
					System.out.println("Board 테이블에 "+result2 + "개가 입력되었습니다.");

				}
			}
			DeleteTable(con);
			UpdateTable(con,"title","content");
			DeleteMemberTable(con);
			UpdateMemberTable(con,"username","password", 0);
			showTable(con);


		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	public static boolean createTable(Connection con, String name) {
		Statement st= null;

		try {
			st=con.createStatement();
			if(name=="member") {
				st.execute("DROP TABLE Member IF EXISTS");
				st.execute("create table Member("
						+ "id int NOT NULL AUTO_INCREMENT primary key,"
						+ "username varchar(10) NOT NULL,"
						+ "password varchar(10) NOT NULL,"
						+ "birthyear int NOT NULL,"
						+ "regidate date NOT NULL DEFAULT (curdate()))");
			}else {
				st.execute("DROP TABLE Board IF EXISTS");
				st.execute("create table Board("
						+ "num int NOT NULL AUTO_INCREMENT primary key,"
						+ "title varchar(200) NOT NULL,"
						+ "content varchar(2000) NOT NULL,"
						+ "id varchar(10) NOT NULL,"
						+ "postdate date NOT NULL DEFAULT (curdate()),"
						+ "visitcount int DEFAULT 0)");
			}

		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if(st!=null) st.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public static boolean DeleteTable(Connection con) {
		System.out.println("삭제할 번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();


		Statement st =null;

		try {
			st=con.createStatement();

			PreparedStatement psmt3=null;
			psmt3= con.prepareStatement("DELETE FROM Board WHERE NUM=?;");

			psmt3.setInt(1,num);	

			int result1 = psmt3.executeUpdate();
			System.out.println("Board 테이블에 "+num + "이 삭제되었습니다.");

		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if(st!=null) st.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}


	public static boolean UpdateTable(Connection con,String title, String content) {

		System.out.println("업데이트할 번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();

		Statement st =null;

		try {
			st=con.createStatement();

			PreparedStatement psmt4=null;
			psmt4= con.prepareStatement("UPDATE Board SET title=?, content=? WHERE NUM=?;");

			psmt4.setString(1,"Hi");
			psmt4.setString(2, "content11");
			psmt4.setInt(3, num1);

			int result1 = psmt4.executeUpdate();
			System.out.println("Board 테이블에"+num1+"번 Title과 Content가 업데이트되었습니다.");

		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if(st!=null) st.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}


	public static boolean DeleteMemberTable(Connection con) {
		System.out.println("삭제할 번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num2=sc.nextInt();


		Statement st =null;

		try {
			st=con.createStatement();

			PreparedStatement psmt4=null;
			psmt4= con.prepareStatement("DELETE FROM Member WHERE ID=?;");

			psmt4.setInt(1,num2);	

			int result1 = psmt4.executeUpdate();
			System.out.println("Member 테이블에 "+ num2 + "번이 삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

	public static boolean UpdateMemberTable(Connection con,String name, String pwd, int birthyear) {

		System.out.println("업데이트할 Member정보를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int ID=sc.nextInt();
		String name1 = sc.next();
		String pwd1 = sc.next();
		int Birth = sc.nextInt();

		Statement st =null;

		try {
			st=con.createStatement();

			PreparedStatement psmt4=null;
			psmt4= con.prepareStatement("UPDATE Member SET username=?, password=?, birthyear=? where ID=?;");


			psmt4.setInt(4, ID);
			psmt4.setString(1,name1);			
			psmt4.setString(2,pwd1);			
			psmt4.setInt(3, Birth);

			int result1 = psmt4.executeUpdate();
			System.out.println("Member 테이블의"+ID+"번 정보가 업데이트되었습니다.");

		} catch(SQLException e) {
			e.printStackTrace();
		}

		return true;
	}


	public static boolean showTable(Connection con) {
		System.out.println("등록된 사용자 목록을 출력합니다.");


		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Member");

			while(rs.next()) {
				System.out.println(rs.getInt("id")+",");
				System.out.println(rs.getString("username")+",");
				System.out.println(rs.getString("password")+",");
				System.out.println(rs.getInt("birthyear")+",");
				System.out.println(rs.getString("regidate"));
				System.out.println();

			}
			} catch(SQLException e) {
				e.printStackTrace();
			}

			return true;
		
	}
}





package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryByStatement {
	
	//실습할때 최대한 주석을 많이 달기, 주석만 남기고 지우고 다시 훈련 연습
	//1. 프로젝트 생성 및 드라이버 설정
	//2. JDBC 드라이버 로딩하기(Class.forName())
	//3. DBMS 서버와 접속하기 (DriverManager.getConnection())
	//4. SQL문 실행하기 - Statement
	//5. SQL문 실행하기 - PreparedStatement
	//6. 자원 해제하기
	
	public static void main(String[] args) {
		
		Connection con = null;
		try {	
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/world";
		String username ="scott";
		String password = "tiger";
		
	
			Class.forName(driver);
			con = DriverManager.getConnection(url,username, password);
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select id, name, countrycode, district, population from city limit 10");
			
			while(rs.next()) {
				System.out.println(rs.getString("id")+",");
				System.out.println(rs.getString("name")+",");
				System.out.println(rs.getString("countrycode")+",");
				System.out.println(rs.getString("district")+",");
				System.out.println(rs.getString("population")+"\n");
				
			}
			rs.close();
			st.close();
			con.close();
			
					
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("연결 실패:"+ e.getMessage());
		}

	}

}

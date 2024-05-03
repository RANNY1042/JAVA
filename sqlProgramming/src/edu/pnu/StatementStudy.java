package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class StatementStudy {

	public static void main(String[] args) {
		//		cityquery();
		//		countryquery();
		//		countrylanguage();
		//		KOREAPOP();

		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Table Name:");
			String tblname = sc.next();
			test(tblname);
		}

	}
	private static void test(String tblname) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott","tiger");

			st= con.createStatement();
			rs = st.executeQuery("select * from"+tblname+"limit 10");

			/////////////////////////////////////////////////////////////////////////////////////
			ResultSetMetaData meta = rs.getMetaData();

			int count = meta.getColumnCount();
			while(rs.next()) {
				for(int i = 1; i<= count; i++){
					System.out.print(rs.getString(i)+((i==count)?"":","));
				}
				System.out.println();

			}rs.close();
			st.close();
			con.close();			

		}catch(Exception e) {
			System.out.println("연결실패 :"+e.getMessage());
		}

	}
	public static void cityquery() {
		try {
			Connection con = null;
			String driver ="com.mysql.cj.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/world";
			String username ="scott";
			String password ="tiger";

			Class.forName(driver);
			con = DriverManager.getConnection(url,username, password);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from city");

			while(rs.next()) {
				System.out.println(rs.getString("name")+",");
				System.out.println(rs.getString("countrycode")+",");
				System.out.println(rs.getString("district")+",");
				System.out.println(rs.getString("population")+"\n");
			}
			rs.close();
			st.close();
			con.close();
		}catch(Exception e) {
			System.out.println("연결실패 :" + e.getMessage());
		}
	}

	public static void countryquery() {
		try {
			Connection con = null;
			String driver ="com.mysql.cj.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/world";
			String username ="scott";
			String password ="tiger";

			Class.forName(driver);
			con = DriverManager.getConnection(url,username, password);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from country");

			while(rs.next()) {
				System.out.println(rs.getString("name")+",");
				System.out.println(rs.getString("continent")+",");
				System.out.println(rs.getString("Region")+",");
				System.out.println(rs.getString("surfaceArea")+",");
				System.out.println(rs.getString("IndepYear")+",");
				System.out.println(rs.getString("Population")+",");
				System.out.println(rs.getString("LifeExpectancy")+",");
				System.out.println(rs.getString("GNP")+",");
				System.out.println(rs.getString("GNPOld")+",");
				System.out.println(rs.getString("LocalName")+",");
				System.out.println(rs.getString("GovernmentForm")+",");
				System.out.println(rs.getString("HeadOfState")+",");
				System.out.println(rs.getString("Capital")+",");
				System.out.println(rs.getString("Code2")+"\n");
			}
			rs.close();
			st.close();
			con.close();

		}catch(Exception e) {
			System.out.println("연결실패 :" + e.getMessage());
		}
	}
	public static void countrylanguage() {
		try {
			Connection con = null;
			String driver ="com.mysql.cj.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/world";
			String username ="scott";
			String password ="tiger";

			Class.forName(driver);
			con = DriverManager.getConnection(url,username, password);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from countrylanguage");


			while(rs.next()) {
				System.out.println(rs.getString("CountryCode")+",");
				System.out.println(rs.getString("Language")+",");
				System.out.println(rs.getString("IsOfficial")+",");
				System.out.println(rs.getString("Percentage")+"\n");
			}
			rs.close();
			st.close();
			con.close();
		}catch(Exception e) {
			System.out.println("연결실패 :" + e.getMessage());
		}
	}

	public static void KOREAPOP() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott","tiger");

			String sql = "select name,population from city where countrycode ='KOR' order by population DESC";

			st= con.createStatement();
			rs = st.executeQuery(sql);

			/////////////////////////////////////////////////////////////////////////////////////
			ResultSetMetaData meta = rs.getMetaData();

			int count = meta.getColumnCount();
			while(rs.next()) {
				for(int i = 1; i<= count; i++){
					System.out.print(rs.getString(i)+((i==count)?"":","));
				}
				System.out.println();

			}rs.close();
			st.close();
			con.close();			

		}catch(Exception e) {
			System.out.println("연결실패 :"+e.getMessage());
		}
	}
}






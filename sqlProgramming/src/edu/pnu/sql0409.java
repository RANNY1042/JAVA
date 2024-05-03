package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sql0409 {

	public static void main(String[] args) {

		Connection con = null;

		//데이터 베이스 연결 객체 가져오기
		try {
			String driver ="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/world";
			String username = "user";
			String password = "1234";

			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
			
			
			//질의객체 생성
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT COUNTRYCODE,POPULATION FROM city order by countrycode ASC, POPULATION desc");

			while(rs.next()) {
				System.out.println(rs.getString("COUNTRYCODE")+"," );
				System.out.println(rs.getInt("POPULATION")+"\n" );
			}
			rs.close();
			st.close();
			con.close();

		}catch(Exception e) {
			System.out.println("연결 실패 :" +e.getMessage());
		}

	}

}

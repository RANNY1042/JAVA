package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Code:");
//		String code = sc.next();
		

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
					PreparedStatement pt = con.prepareStatement("SELECT COUNTRYCODE,POPULATION FROM city where countrycode=? order by countrycode ASC, POPULATION desc");
					pt.setString(1, "KOR");
					ResultSet rs = pt.executeQuery();

					while(rs.next()) {
						System.out.println(rs.getString("COUNTRYCODE")+"," );
						System.out.println(rs.getInt("POPULATION")+"\n" );
					}
					rs.close();
					pt.close();
					con.close();

				}catch(Exception e) {
					System.out.println("연결 실패 :" +e.getMessage());
				}

			}

		}

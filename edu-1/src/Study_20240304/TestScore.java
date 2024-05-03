package Study_20240304;

import java.util.Scanner;

public class TestScore {
		int score; 
		static String grade;
	
	public static void main(String[] args) {
		System.out.println("성적을 입력하세요");	
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score>=95) {
			grade = "A+";
		}else if (score >=90){
			grade = "A0";
		}else if (score >=85){
			grade = "B+";
		}else if (score>=80){
			grade = "B0";
		}else if (score>=75) {
			grade = "C+";
		}else if (score>=70) {
			grade = "C0";
		}else if (score>=65) {
			grade = "D+";
		}else if (score>=60) {
			grade = "D0";
		}else grade = "F";
				
		System.out.println("당신의 성적은 "+grade+"입니다.");
	}

}

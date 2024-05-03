package Study_20240306;

//메소드에 배열 전달 실습부터
//실습 설명한다 
//매개변수로 배열 전달
import java.util.Random;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		showData(data);
		int max = findMax(data);
		System.out.println("\nmax = " + max);
		boolean existValue = findValue(data, 3);
		System.out.println("찾는 값 = " + 3 + ", 존재여부 = " + existValue);
	}
	static void showData(int[]data) {
		for (int num: data) {    //확장형 for문
			System.out.print(num+" ");
		}
	}
	public static void inputData(int []data) {//교재 63 - 난수의 생성
		Random rand = new Random();
		for(int i=0; i<data.length; i++)
			data[i]=rand.nextInt(100);
	}
	static int findMax(int []items) { //
		int max = items[0];
		for (int i=0; i<items.length; i++)
			if(items[i]>max)
				max = items[i];
		return max;

	}
	static boolean findValue(int []items, int value) {
		//items[]에 value 값이 있는지를 찾는 알고리즘 구현
			
			boolean result = false;
			for(int i=0; i< items.length ; i++)
				if (value == items[i]) {
					result = true;
				}
			return result;

	}

}

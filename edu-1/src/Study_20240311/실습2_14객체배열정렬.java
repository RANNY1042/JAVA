package Study_20240311;

import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData>{
	String name;
	int height;
	double vision;

	@Override
	public String toString() {

	}

	public int compareTo(PhyscData p) {
		if(vision > p.vision)
			return 1;
		else if (vision<p.vision)
			return -1;
		else if (height > p.height)
			return 1;
		else return 0;
	}
	
	public int equals(PhyscData p) {

	}
}

public class 실습2_14객체배열정렬 {
	static void swap(PhyscData[]arr, int ind1, int ind2) {
		int temp = arr[ind1];
		arr[ind1]= arr[ind2];
		arr[ind2]= temp;
	}
	
	static void sortData(PhyscData []arr) {
		Arrays.sort(arr);
		
	}
	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("홍길동", 162, 0.3),
				new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7),
				new PhyscData("김홍길동", 172, 0.3),
				new PhyscData("이길동", 182, 0.6),
				new PhyscData("박길동", 167, 0.2),
				new PhyscData("최길동", 169, 0.5),
		};
		
//		if(data[0].compareTo(data[1])>0)
//			System.out.println();
		
		showData("정렬전",data);
		sortData(data);
		showData("정렬후",data);
		reverse(data);
		//Arrays.sort(null, null);//comparator가 필요하다  
		showData("역순 재배치후", data);
		Arrays.sort(data);
		showData("Arrays. data);
	}
	
	static void showData(PhyscData[]arr) {
		for (int[] i : arr) { // 확장 for문
			System.out.print(i + " ");

	}

}
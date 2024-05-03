package Study_20240311;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 실습3_8_128p {
	
	
	public static class PhyscsData{
		private String name;
		private int height;
		private double vision;
	}
	
	static class PhyscData(String name, int height, double vision) {
		this.name = name; 
		this.height = height;
		this. vision = vision;
	}
		
	public String toString() {
		return name +" "+height+" "+vision;
	}
	
	public static final Comparator<PhyscData> HEIGHT_ORDER
	=new HeightOrderComparator();
	
	private static class HeightOrderCompartor implements Comparator<PhyscData>{
		public int compare(PhyscData d1, PhyscData d2) {
			return (d1.height>d2.height) ? 1:
				   (d1.height<d2.height) ? -1: 0;
		}
	}	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {
				new PhyscData("이나령",162,0.3),
				new PhyscData("유지훈",168,0.4),
				new PhyscData("전서현",171,1.5),
				new PhyscData("이호연",173,0.7),
				new PhyscData("이수민",175,2.0),
		};
		System.out.println("몇 cm인 사람을 찾고 있나요?:");
		int height = stdIn.nextInt();
		int idx = Arrays.binarySearch(x,
				new PhyscData("",height,0.0),
				PhyscData.HEIGHT_ORDER
				);
		
		if(idx<0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은 데이터:"+x[idx]);
		}

	}

}

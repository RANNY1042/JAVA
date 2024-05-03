package Study_20240306;

	import java.util.Arrays;
	//comparator, comparable 차이가 무엇인지 사용예 파악
	//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
	class PhyscData implements Comparable<PhyscData>{ 
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height=height;
			this.vision=vision;
		}

		@Override
		public String toString() {
			return name+"님의 키는"+height+"이며,시력은"+vision+"입니다.";
			
		}
	
		@Override
		public int compareTo(PhyscData p) {  //compare To로 구현 (2장,3장 복습)
				return this.height-p.height;		
		}
		
		
//		public int equals(PhyscData p) {
//							
//		}
	}
		
	
	
	public class Assignment {
		static void swap(PhyscData []arr, int ind1, int ind2) {
				PhyscData temp = arr[ind1];
				arr[ind1]=arr[ind2];
				arr[ind2]= temp;
			
		}
		
		
		static void sortData(PhyscData []arr) {
			for (int i = 0; i<arr.length; i++)
				for(int j = i+1; j<arr.length; j++)	//if(arr[i]<arr[j]) 
					if(arr[i].compareTo(arr[j])>0)
						swap(arr,i,j);
			
		}
		
		static void showData(PhyscData[]arr) {
			for (PhyscData i : arr) { // 확장 for문
					System.out.println(i + " ");
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			PhyscData[] data = {
					new PhyscData("홍길동", 162, 0.3),
					new PhyscData("홍동", 164, 1.3),
					new PhyscData("홍길", 152, 0.7),
					new PhyscData("김홍길동", 172, 0.3),
					new PhyscData("이길동", 182, 0.6),
					new PhyscData("박길동", 167, 0.2),
					new PhyscData("최길동", 169, 0.5),};
			
			showData(data);
			sortData(data);
			//Arrays.sort(null, null);//comparator가 필요하다 
			showData(data);
		}
		

	}
	
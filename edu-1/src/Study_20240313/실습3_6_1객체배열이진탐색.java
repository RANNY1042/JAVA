package Study_20240313;

	/*
	 * Comparable 구현
	 */
	/*
	 * 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
	 * 함수(메소드) 전체를 작성하는 훈련 
	 */
	import java.util.Arrays;

	//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
	class PhyscData2 implements Comparable<PhyscData2>{
		String name;
		int height;
		double vision;

		@Override
		public String toString() {
			return name,height,vision;			
		}
		
		@Override
		public int compareTo(PhyscData2 p) {
			return this.vision-p.vision
			
		}
//		public int equals(PhyscData2 p) {
//			
//		}				
	}
		
	
	public class 실습3_6_1객체배열이진탐색 {
		
		static void swap(PhyscData2[]data, int ind1, int ind2) {
			PhyscData2 temp = data[ind1];
			data[ind1]=data[ind2];
			data[ind2]=temp;
		}
		
		static void showData(PhyscData2[]data) {
			for (PhyscData2 i: data) {
				System.out.println(i+" ");
				
			}
			System.out.println();
		}
		
		static void linearSearch (PhyscData2[]data,String name,int heihgt, double vision) {
			
			int i = 0;
			
			while(true) {
				if(i==data.length)
					return -1;
				if(data[i]==key)
					return i;
				i++;
			}
		}
		
		static void binarySearch (PhyscData2[]data, String name, int height, double vision) {
			int pl = 0;
			int pr = n-1;
			
			do {
				int pc=(pl+pr)/2;
				if(data[pc]==key)
					return pc;
				else if (data[pc]<key)
					pl=pc+1;
				else 
					pr=pc-1;
			}while (pl<=pr);
			
			return -1;
		}
		

		public static void main(String[] args) {
			PhyscData2[] data = {
					new PhyscData2("홍길동", 162, 0.3),
					new PhyscData2("나동", 164, 1.3),
					new PhyscData2("최길", 152, 0.7),
					new PhyscData2("김홍길동", 172, 0.3),
					new PhyscData2("박동", 182, 0.6),
					new PhyscData2("이동", 167, 0.2),
					new PhyscData2("길동", 167, 0.5),
			};
			showData("정렬전", data);
			sortData(data);
			showData("정렬후", data);
			reverse(data);
			showData("역순 재배치후", data);
			Arrays.sort(data);//사용된다 그 이유는?
			showData("Arrays.sort() 정렬후", data);
			
			PhyscData2 key = new PhyscData2("길동", 167, 0.2);
			int resultIndex = linearSearch(data, key);
			System.out.println("\nlinearSearch(<길동,167,02>): result = " + resultIndex);
			
			key = new PhyscData2("박동", 182, 0.6);
			/*
			 * 교재 109~113
			 */
			resultIndex = binarySearch(data, key);//comparable를 사용
			System.out.println("\nbinarySearch(<박동,182,0.6>): result = " + resultIndex);
			key = new PhyscData2("이동", 167, 0.6);
			/*
			 * 교재 115 Arrays.binarySearch에 의한 검색
			 */
			resultIndex = Arrays.binarySearch(data, key);//comparable를 사용
			System.out.println("\nArrays.binarySearch(<이동,167,0.6>): result = " + resultIndex);
		}
		
		

	}

package Study_20240313;

	//comparator 구현 실습
	/*
	* 교재 121 실습 3-6 
	* 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
	* 함수(메소드) 전체를 작성하는 훈련 
	*/
	import java.util.Arrays;
	public class 실습3_6스트링배열정렬이진탐색 {
		
		static void showData(String message, String data) {
			System.out.println(message);
			for (String i: data) {
				System.out.println(i);
			}
		}
		
		static void shortData(String data) {
			Arrays.sort(data);
		}

		static void swap(String[]data, String ind1, String ind2) {
				String temp = data[ind1];
				data[ind1]=data[ind2];
				data[ind2]=temp;
		}
		
		
		static void reverse(String[] a) {//교재 67페이지
			for (int i=0; i<a.length/2; i++)
				swap(a, i, a.length-i-1);
			
		}
		
		static void linearSearch(String data, String key) {
			
			int i = 0;
			
			while(true) {
				if(data.length == i)
					return -1;
				if(data[i]==key)
					return i;
				else i++;
			}
			
		}
		
		static void binarySearch(String data, String key) {
			
			int pl = 0;
			int pr = data.length-1;
			
			do {
				int pc=(pl+pr)/2;
				if (item[pc]==key)
					return pc;
				else if (item[pc]<key)
					pl = pc+1;
				else 
					pr = pc-1;
			} while (pl <=pr);
			
			
			return -1;			
			
		}
		
		public static void main(String[] args) {
			String []data = {"사과","포도","복숭아", "감", "산딸기", "블루베리", "대추", "수박", "참외"};//홍봉희 재배 과수

			showData("정렬전", data);
			sortData(data);
			showData("정렬후", data);
			reverse(data);//역순으로 재배치
			showData("역순 재배치후", data);
			Arrays.sort(data);//Arrays.sort(Object[] a);  //
			showData("Arrays.sort()로 정렬후",data);
	      
			String key = "포도";
			int resultIndex = linearSearch(data, key);
			System.out.println("\nlinearSearch(포도): result = " + resultIndex);

			key = "배";
			/*
			 * 교재 109~113
			 */
			resultIndex = binarySearch(data, key);
			System.out.println("\nbinarySearch(배): result = " + resultIndex);
			key = "산딸기";
			/*
			 * 교재 115 Arrays.binarySearch에 의한 검색
			 */
			resultIndex = Arrays.binarySearch(data, key);
			System.out.println("\nArrays.binarySearch(산딸기): result = " + resultIndex);

		}


	}
package Study_20240307;

/* Arrays.sort()
 * collections.sort()
 * list.sort()
 * 내가구현
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_Array { //자바 컬렉션 복습

	    public static String[] removeElement1(String[] arr, String item) {
	    	//현재 배열에서 중복 제거하려면 코드가 길어진다 
	    	//배열을 리스트로 변환 > list.remove();
	    	//삭제된 리스트를 배열로 변환해서 리턴
	    }
	    
	    static void getList(List<String> list) {
			list.add("서울");	list.add("북경");
			list.add("상해");	list.add("서울");
			list.add("도쿄");	list.add("뉴욕");


			list.add("런던");	list.add("로마");
			list.add("방콕");	list.add("북경");
			list.add("도쿄");	list.add("서울");

			list.add(1, "LA");
	    }
	    static void showList(String topic, List<String> list) {
	    	System.out.println(topic+"::");
//	    	for (int = 0;)
	    	for(String st: list) { //확장형 for문
	    		
	    	}
	    }
	    static void sortList(List<String> list) {
	    	//방법 1 : list.sort(null);
	    	//방법 2 : 리스트를 스트링 배열로 변환 String cities[]=list.toArray()

	    }
	    
	    static String[] removeDuplicateList(List<String> list) { 
		    String cities[] = new String[0];
		    cities = list.toArray(cities); 
		    //list를 배열 cities[]로 변환
		    //for문으로 도시가 중복인것을 체크 = compareTo를 사용해서 
		    int count = cities.length;
		    for(int i =0 ; i<count; i++) {
		    	int j = i+1;
		    	while (j<count) {
		    		if() {
		    			cities = removeElement1(cities,city);
		    		}
		    		
		    		//j 수정하고 나머지 작업
		    	}
		    }
		    
		    if() {//배열에서 중복 검사하여 참이면 
		    removeElement1(cities,city);//중복 제거를 위해 배열 전달 
		    //Arrays.List 
		    return cities;
	    }
	    
		public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<>(); //두번째는 제네릭 string 생략 
			getList(list);
			showList("입력후", list);
			//sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩

//		    Collections.sort(list);

//배열의 정렬
			sortList(list);
		    System.out.println();
		    showList("정렬후", list);
		    
// 배열에서 중복제거
		    System.out.println();
		    System.out.println("중복제거::");
		  
		    String[] cities = removeDuplicateList(list);
		    /*리스트를 배열로 변환 > 배열에서 중복을 찾는다 */
	        ArrayList<String> lst = new ArrayList<>(Arrays.asList(cities));
		    showList("중복제거후", lst);
		}
	}

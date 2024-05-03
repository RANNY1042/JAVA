package Study_20240321;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class ch10_Test10 {

	public static void main(String[] args) {
		
		lotto_generator(5);
	}
	
	public static void lotto_generator(int n) {
		Random number =new Random(); //Random클래스를 생성
		HashSet<Integer> lotto = null; // Integer 타입을 저장하는 HashSet을 참조할 lotto 지역변수를 선언한후, 초깃값을 null로 지정
		for(int i =0; i<n;i++) { //반복문 안에 해쉬객체를 생성
			
			lotto = new HashSet<Integer>();
			
			for(int j =0; lotto.size() <=6; j++) { //반목은은 각 HashSet에 저장되는 숫자의 개수만큼 반복
				lotto.add(number.nextInt(45)+1);  //Hashset에 새로운 데이터를 추가
			} // 1부터 45사이의 정수 중 임의의 수 하나를 선택해서 반환한다. 
			//만일 number.nextInt() 반환값이 Hashset에 저장된 값이라면 저장하지 않는다.(set컬렉션은 중복된 값을 저장할 수 없다.)
			
			List<Integer> L = new ArrayList<Integer>(lotto);  //Hashset이 lotto를 초깃값으로 갖는 새로운 ArrayList를 생성
			Collections.sort(L);  //인자로 전달받은 List값을 오름차순으로 정렬
			System.out.println(L);
		}
	}

}

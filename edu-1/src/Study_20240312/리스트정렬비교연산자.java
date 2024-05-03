package Study_20240312;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 리스트정렬비교연산자 {

	public static void main(String[] args) {

		ArrayList<Fruit1>list = new ArrayList<>();
		list.add(new Fruit1("Apple",2000));
		list.add(new Fruit1("Orange",3000));
		list.add(new Fruit1("Banana",1000));
		System.out.println("원본:"+list);
		
		Collections.sort(list);
		System.out.println("오름차순:"+list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("내림차순"+list);

	}

}
	class Fruit1 implements Comparable<Fruit1>{
		private String name;
		private int price;
		
		public Fruit1(String name, int price) {
			this.name = name;
			this.price = price;
		}
	
	@Override
	public int compareTo(Fruit1 fruit) {
		if(fruit.price<price) {
			return 1;
		}else if (fruit.price>price) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "["+this.name+":"+this.price+"]";
	}

}

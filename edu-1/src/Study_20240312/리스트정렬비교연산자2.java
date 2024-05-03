package Study_20240312;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 리스트정렬비교연산자2 {

	public static void main(String[] args) {
	
	ArrayList<Fruit>list = new ArrayList<>();
	list.add(new Fruit("Apple",2000));
	list.add(new Fruit("Orange",3000));
	list.add(new Fruit("Banana",1000));
	
	System.out.println("원본"+list);
	
	Collections.sort(list,new FruitPriceComparator());
	System.out.println("Price순 오름차순:"+list);
	
//	Collections.sort(list, new FruitPriceComparator().reversed());
//	System.out.println("Price순 내림차순:"+list);
	
	Collections.sort(list, new FruitNameComparator());
	System.out.println("Name순 오름차순:"+list);
	
	Collections.sort(list,new FruitNameComparator().reversed());
	System.out.println("Name순 내림차순:"+list);

	}

}

class FruitPriceComparator implements Comparator<Fruit>{
	
	public int compare(Fruit f1, Fruit f2) {
		if(f1.price>f2.price) {
			return 1;
		}else if (f1.price < f2.price) {
			return -1;
		}
		return 0;
		}

	public java.util.Comparator reversed() {
		// TODO Auto-generated method stub
		return null;
	}
	}

class FruitNameComparator implements Comparator<Fruit>{
	public int compare(Fruit f1, Fruit f2) {
		return f1.name.compareTo(f2.name);
	}

}

class Fruit{
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	public String toString() {
		return "["+this.name+":"+this.price+"]";
	}
}
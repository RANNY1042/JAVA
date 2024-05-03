package Study_20240311;

import java.util.Arrays;
import java.util.Collections;

public class People implements Comparable {
	
	private String name;
	private int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String print() {
		return name+"("+age+")";
	}
	
	public int compareTo(People people) {
		if (this.age < people.age) {
			return name+"("+age+")";
			
		}
	
	public int CompareTo(People People) {
		if (this.age<People.age) {
			return -1;
		} else if (this.age == People.age) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public class Sort{

	public static void main(String[] args) {
		
		People[] arr= {new People("상현", 20)
				, new People("철수",14)
				, new People("경완",31)
				, new People("대호",40)
				, new People("지운", 24)
		};
		
		Arrays.sort(arr);
		
		for (People i : arr) {
			System.out.println("["+i.print()+"]");
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println();
		
		for (People i : arr) {
			System.out.println("["+i.print()+"]");
		}
	}
	

	}

}

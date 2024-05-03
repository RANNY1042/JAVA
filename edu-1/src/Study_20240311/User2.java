package Study_20240311;

import java.util.Arrays;
import java.util.Comparator;

public class User2{
	int no;
	String name;
	
	public User2(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int compare(User o1, User o2) {
		return o1.no - o2.no;
	}
}	


class SortTest{

	public static void main(String[] args) {
	
		int[]num = {1,6,4,2,3,5};
		char[]ch = {'B','D','E','C','A'};
		String[]str = {"Bbb","Bdd","Eee","Ccc","Aaa"};
		
		User2[] userList = {
				new User2(1,"Steve"),
				new User2(2,"Tom"),
				new User2(3,"Jane"),
				new User2(4,"Henry"),
				new User2(3,"Joker"),
		};
	
	
	Arrays.sort(userList,userList[0]);
	
	for(User2 i : userList)
		System.out.println(i.no+" "+i.name);
	
	}

}

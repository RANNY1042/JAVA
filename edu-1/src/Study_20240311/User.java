package Study_20240311;

import java.util.Arrays;

public class User implements Comparable<User>{
	int no;
	String name;
	
	public User(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	@Override
	public int compareTo(User o) {
		return this.no-o.no;
	}
	
}	
class SortTest{

	public static void main(String[] args) {
	
		User[] userList = {
				new User(1,"Steve"),
				new User(5,"Tom"),
				new User(2,"Jane"),
				new User(4,"Henry"),
				new User(3,"Joker"),
		};
		
		Arrays.sort(userList);

		for(User i :userList) 
			System.out.println(i.no+i.name);
	}

}

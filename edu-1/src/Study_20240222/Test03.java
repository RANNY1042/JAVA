package Study_20240222;

import java.util.Arrays;
import java.util.List;

import java.util.Vector;

public class Test03 {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>(20);
		
		vector.addElement("서울");
		vector.addElement("도쿄");
		vector.addElement("뉴욕");
		
		for(int i =0; i<vector.size(); i++) {
			System.out.println(vector.elementAt(i+"\t"));
		}
		
		System.out.println("\n");
		
		System.out.println("1:"+ vector.firstElement());
		

	}

}

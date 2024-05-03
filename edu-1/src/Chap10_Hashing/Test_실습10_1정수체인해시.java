package Chap10_Hashing;

import java.util.Scanner;
//체인법에 의한 해시
//--- 해시를 구성하는 노드 ---//

class Node {
	int key;                 // 키값
	Node next;        // 뒤쪽 포인터(뒤쪽 노드에 대한 참조)

	Node(int key, Node next){
		this.key=key;
		this.next=next;
	}

	int getData() {
		return 0;
	}
}

class SimpleChainHash {
	private int    size;              // 해시 테이블의 크기
	private Node[] table;        // 해시 테이블

	SimpleChainHash(int size){

		try {
			table = new Node[size];
			this.size = size;

		}catch (OutOfMemoryError e) {
			this.size=0;
		} 
	} 

	public int hashValue(int key) {
		return key*key*14191 % size;
	}



	//--- 키값이 key인 요소를 검색(데이터를 반환) ---//
	public int search(int key) {
		int hash = hashValue(key);
		Node p = table[hash];

		while(p !=null) {
			if(key== p.key)
				return 1;
			p=p.next;
		}
		return 0;	//키를 찾지 못하면 0을 반환합니다.
	} 

	//--- 키값이 key인 데이터를 data의 요소로 추가 ---//
	public int add(int key) {
		int hash = hashValue(key);
		Node p = table[hash];

		while(p!=null) {
			if(key == p.key)
				return 1; //이미 존재하는 키입니다.
			p = p.next;
		}

		Node temp = new Node(key,table[hash]);
		table[hash]=temp;
		return 0; //성공적으로 추가되었습니다.

	}

	//--- 키값이 key인 요소를 삭제 ---//
	public int delete(int key) {
		int hash = hashValue(key);
		Node p = table[hash];
		Node pp = null;

		while(p!=null) {
			if(key==p.key) {
				if(pp==null){
					table[hash]=p.next;
				}else 
					pp.next =p.next;
				return 0; //성공적으로 삭제
			}
			pp = p;
			p=p.next;
		}
		return 1; //키를 찾지 못했습니다.
	}

	//--- 해시 테이블을 덤프(dump) ---//
	public void dump() {
		for(int i=0; i<size; i++) {
			Node p = table[i];
			System.out.printf("%20d",i);
			while (p!=null) {
				System.out.printf("-> %s",p.key);
				p=p.next;
			}
			System.out.println();
		}
	}
}

public class Test_실습10_1정수체인해시 {

	enum Menu {
		Add("삽입"), Delete("삭제"), Search("검색"), Show("출력"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}
	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}


	//체인법에 의한 해시 사용 예
	public static void main(String[] args) {
		Menu menu;
		SimpleChainHash hash = new SimpleChainHash(11);
		Scanner stdIn = new Scanner(System.in);
		int select = 0, result = 0, val = 0;
		final int count = 15;
		do {
			switch (menu = SelectMenu()) {
			case Add:

				int[] input = new int[count];
				for (int ix = 0; ix < count; ix++) {
					double d = Math.random();
					input[ix] = (int) (d * 20);
					System.out.print(" " + input[ix]);
				}
				for (int i = 0; i < count; i++) {
					if ((hash.add(input[i])) == 0)
						System.out.println("Insert Duplicated data");
				}
				break;
			case Delete:
				// Delete
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.delete(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;
			case Search:
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.search(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;

			case Show:
				hash.dump();
				break;
			}
		} while (menu != Menu.Exit);

	}
}


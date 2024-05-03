package Study_20240227;

public class MyLinkedListTest {


	public static void main(String[] args) {

	MyLinkedList myList = new MyLinkedList(); /*스택에 참조변수 myList가 생성되고, 
											  힙에는 MyLinkedList 인스턴스가 생성 생성된 인스턴스는 mylist변수가 참조한다*/
	myList.print(); /* myList.print()메서드 호출 
	 				print () 메서드는 head값이 null인지 판단 후 null이면 "등록된 데이터가 없습니다" 문자열 출력*/
	myList.add("JAVA");
	myList.add("JSP");
	myList.add("Servlet"); 
					/* myList의 add()메서드 호출 
					 * add()메서드 호출 시 전달한 "Java"문자열이 매개변수 data에 저장되고,
					 * 스택에 Node타입의 new Node변수가 생성되며, 
					 * new Node(data)명령문에 의해 새로운 Node인스턴스가 생성
					 */
	
	myList.print();
	
	}

}

/*힙에 Node의 data, link필드가 생성되고 Node(String)생성자에 의해 
 * "JAVA"문자열이 data필드에 저장된다.
 * 생성된 인스턴스의 주소는 newNode변수에 저장한다. 
 * 객체 생성 후 head의 값을 판단하여 null이면 head변수에 newNode 변숫값을 저장한다.

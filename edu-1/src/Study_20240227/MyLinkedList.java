package Study_20240227;

public class MyLinkedList {
	
	/*My linked 클래스를 선언하고 
	 * 클래스의 멤버로 head 필드와 내부 클래스 Node를 선언하고 있음
	 * head필드와 Node 내부클래스 모두 private로 선언하여 외부에서 직접 접근하지 못하도록 하고 있음  */ 
	
	private Node head = null;
	
	private class Node {		
		private String data;
		private Node link;
		
		public Node(String data) {
			this.data = data;
		}
	}

	/*내부클래스 Node를 선언
	 * data, link필드와 Node(String)생성자를 선언하고, 
	 * MyLinkedlist 클래스내에서만 사용하고자 선언한 내부클래스*/
	
	
public void add(String data) {
	Node newNode = new Node(data);
	if(head == null) {
		head = newNode;
	} else {+
		Node next = head; 
		while(next.link != null) {
			next = next.link;
		}
		next.link = newNode;
	}
}
	/* MyLinkedList 클래스의 add(String)메서드는 실행할때마다 
	 * 내부 클래스 Node의 인스턴스를 생성한다.
	 */
	

public void print () {
	if(head == null) {
		System.out.println("등록된 데이터가 없습니다.");
	} else {
		System.out.println("등록된 데이터는 다음과 같습니다.");
		Node next = head;
		while (next != null) {
			System.out.println(next.data);
			next = next.link;
		}
	}
}
	public static void main(String[] args) {
		

	}

}

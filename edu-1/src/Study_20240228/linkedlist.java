package Study_20240228;

public class linkedlist {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int d) // 생성자(constructor)
		{
			data = d; 
			next = null;
		}
	}
	
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;
	}

	public static void main(String[] args) {
	
	/*연결리스트는 하나의 클래스로 표현되고, 노드는 그 안의 분리된 클래스로 표현 (내부클래스)
	 *연결리스트 클래스의 헤드는 노드를 참조, 노드클래스 타입으로 선언
	 *(내부클래스) 노드클래스는 데이터를 저장하는 data필드,next필드(다음 노드를 참조)가지고 있으며, 
	 *생성자를 가지고 있는데 이는 노드가 생성될때 데이터를 d로 초기화하고, 포인터를 null로 초기화하는 역할
	 */

	}

}

package ruby.java.ch08.polymorphism;

public class MyLinkedList2 {
	
class Node{	
	private Node head = null;
	
		private String data;
		private Node link;
		public Node(String Data) {
			//생성자는 필드가 2개이므로 heap에 필드공간 2개를 할당
			this.data=data; this.link = null;
		}

public Node(Node head) {
			this.head=head;
		}
	}
	
	public void add(String data) {
		}
		
	public MyLinkedList2(Node head) {
		this.head=head;
	}

	public static void main(String[] args) {
		Node newNode = new Node(data);
		if(head == null) {
		   head = newNode;
			
		} else {
			Node next = head;
		  while(next.link != null) {
			  next = next.link;
		  }
		  next.link = newNode;
		  
		  
		  
		}
		

	}

}

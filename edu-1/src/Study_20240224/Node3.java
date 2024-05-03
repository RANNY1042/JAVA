package Study_20240224;

class Node3 {
	int data;
	Node3 link;
	public Node3(int data) {
		this.data = data; link = null;
	}
}
class LinkedList3 {
	Node3 first;
	void append(int data) {
		if(first == null) {
		   first = new Node3(data);
		   return;
		}
	
		Node3 q = first;
		while(q!= null) {
			if(q.link ==null) break;
			q = q.link;
		}
		q.link = new Node3(data);
			
	}

	
	void insert(int data) {
		if(first == null) {
			first = new Node3(data);
			return;
		}
			Node3 q = first;
		Node3 p = null;
		while(q != null) {
		if(data < q.data) break;
		p = q;
		q = q.link;
		}
		if (p==null) {
			p= new Node3(data);
			p.link = q;
			first =p;
		} else {
			p.link = new Node3(data);
			p = p.link;
			p.link = q;
		}
	}
	
	void showList() {
		
		Node3 q = first;
		
		while(q !=null) {
			System.out.println(q.data+"\t");
			q=q.link;
		}
		
		
	}

public class Test_ch08_연결리스트와배열 {
	static int getList(int[]data) {
		int count = 0;
		int mid = data.length/2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5; count++;
		}
		return count;
	}
	static void showList(int[]data) {
		System.out.println();
		for (int i=0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i]+ " ");
		}
	}
	static int insertList(int[] data, int count, int x) {
		int indx = 0;}

	
public static void main(String[] args) {
	int[]list = new int[10];
	int count = 0;
	System.out.println("배열로 리스트::");
	count = getList(list);
	showList(list);
	count = insertList(list, count, 3);
	showList(list);
	count = insertList(list, count, 7);
	showList(list);
	
	LinkedList3 ll = new LinkedList3();
	ll.append(5);ll.append(10);ll.append(15);ll.append(20);ll.append(25);
	ll.showList();
	ll.insert(3);ll.showList();
	ll.insert(7);ll.showList(); }
	}
	
	
	

package Test;

public class LinkedList_Test {
	
	class Node3 {
		int data;
		Node3 link;
		public Node3(int data) {
			this.data = data; link = null;
		}
	}
	class LinkedList3 {
		Node3 first;  // Linkedlist ll = new LinkedList new - 메모리 heap에 할당된 주소를 반환한다.
		//new 기능 1.heap에 공간할당 2. 할당된 공간의 주소를 반환
		
		void append(int data) {
			Node3 p = first, Node3 q = null;
									
			Node3 newNode = new Node3(data); // 새로운 노드를 생성
			if (p==null) {
				first = newNode;
				return;
			}else {
				while (p != null) {
					q = p;
					p=p.link;
				}
				q.link = newNode;   
			}
		}
				
		public LinkedList3() {
			first = null;
		}		
		
		//show List함수 
		void showList(int data) {
			System.out.println();
			Node3 p = first, q= null;	
			
			q = first;
				while (q!=null) {
					System.out.println(q.data+"\t");
					q=q.link;
				}
				
				System.out.println();
		}
		
	}
		
		//insert함수	
		void insert(int indx, int data) {
		   if(first == null) {
		   first = new Node3(data);
		   return;
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
			
		
		//알고리즘 코딩
		static int insertList(int[] data, int count, int x) {
			int indx = 0;
			while (indx<count) {
			// for() {
				if(x<data[i]) {
					while (indx < count) {
						int temp = data[i];
						data[indx] = x;
						x = data[++indx]; // 한칸씩 증가 
						}
					break;
				}					
				else
					indx++;
			}
					}
		//count++;
		
		}						
	
	
	
		//배열하면 이동하는 작업
		//Linked list 
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
				
		
		//문제 1. 배열로 리스트 작업		
		
		//LinkedList********************************
				
		//문제2. linked list를 활용 
		//list에서 구현 / append. insert. 
		//linked list함수에서 구현하는 inst함수 생성
		
		LinkedList3 ll = new LinkedList3();
		ll.append(5);ll.append(10);ll.append(15);ll.append(20);ll.append(25);
		ll.showList();
		ll.insert(3);ll.showList();
		ll.insert(7);ll.showList();
	}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

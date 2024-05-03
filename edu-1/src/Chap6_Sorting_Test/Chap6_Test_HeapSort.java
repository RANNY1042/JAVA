package Chap6_Sorting_Test;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

interface MaxHeap {
	public void Insert(int x);

	public int DeleteMax();
}

class Heap implements MaxHeap {
	final int heapSize = 100;
	private int[] heap;
	private int n; // current size of MaxHeap
	private int MaxSize; // Maximum allowable size of MaxHeap
	public int length;

	public Heap(int sz) {
		heap = new int[sz + 1]; // +1 heap[0]을 쓰지 않음 //공통된 양식 (Don't want to use heap[0])
		n = 0;
	}

	public void display() {
		System.out.println("Display : ");
		for (int i = 1; i <= n; i++) {
			System.out.println(heap[i] + " ");
		}
		System.out.println();

	}

	@Override
	public void Insert(int x) {

		if (n == heapSize) {
			HeapFull();
			return;
		}
		n++;

		int i = n;

		while (i > 1 && heap[i / 2] < x) { // i가 루트노드(index i)가 아니고, 삽입할 값이 i의 부모노드(index : i/2)보다 크면
			heap[i] = heap[i / 2]; // i번째 노드와 부모노드를 교환한다. //move from parent to i
			i /= 2;
		}
		heap[i] = x; // 새로운 노드를 삽입
	}

	@Override
	public int DeleteMax() {
		if (n == 0) {
			HeapEmpty();
			return -1;
		}

		int max = heap[1];
		heap[1] = heap[n];
		n--;

		int i = 1;
		int leftChild = 2 * i;
		int rightChild = leftChild + 1;

		while (leftChild <= n) {
			int largeChildIndex = leftChild;
			if (rightChild <= n && heap[rightChild] > heap[leftChild]) {
				largeChildIndex = rightChild;
			}
			if (heap[i] >= heap[largeChildIndex]) {
				break;
			}

			int temp = heap[i];
			heap[i] = heap[largeChildIndex];
			heap[largeChildIndex] = temp; // swap

			i = largeChildIndex;
			leftChild = 2 * i;
			rightChild = leftChild + 1;

		}
		heap[i] = heap[n + 1];

		return max;

	}

	private void HeapEmpty() {
		System.out.println("Heap Empty");
	}

	private void HeapFull() {
		System.out.println("Heap Full");
	}
}

public class Chap6_Test_HeapSort {

	static void showData(int[] d) {
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		int select = 0;
		Scanner stdIn = new Scanner(System.in);
		Heap heap = new Heap(20);
		final int count = 10;
		int[] x = new int[count + 1];
		int[] sorted = new int[count];

		do {
			System.out.println("Max Tree. Select: 1 insert, 2 display, 3 sort, 4 exit => ");
			select = stdIn.nextInt();
			switch (select) {
			case 1:
				System.out.println("input value: ");
				int data = stdIn.nextInt();
				heap.Insert(data);
				break;
			case 2:
				heap.display();
				break;

			case 3: // heap에서 최댓값을 delete하여 sort된 결과를 display하는 알고리즘
				int index=0;
				try {
					while (true) {			
						sorted[index++] = heap.DeleteMax();
						System.out.println("Deleted element:"+sorted[index-1]);
						if(heap.length ==0) {
							break;
						}continue;}
						System.out.println("Sorted array : ");
						{
					for(int i=0; i<sorted.length; i++) {
						System.out.print(sorted[i]+ " ");
					}
					System.out.println();
					}
										
										
						
				} catch (NoSuchElementException e) {
					System.out.println("Heap is empty");
					
				}
					

			case 4:
				System.out.println("Invalid selection");
				return;
			}
}while(select<5);

	return;
}
}

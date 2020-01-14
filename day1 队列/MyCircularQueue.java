package day1;

import java.util.Arrays;

public class MyCircularQueue {
	private int[] data;
	private int head;
	private int tail;
	private int size;
	
	public MyCircularQueue(int k) {
		data=new int[k];
		head=-1;
		tail=-1;
		size=k;
		
	}
	public int Front() {
		if(isEmpty()==true) {
			return -1;
		}
		return data[head];
	}
	public int Rear() {
		if(isEmpty()==true) {
			return -1;
		}
		return data[tail];
		
	}
	
	public boolean enQueue(int value) {
		if(isFull()==true) {
			return false;
		}
		if(isEmpty()==true) {
			head=0;		
		}
		tail=(tail+1)%size;
		data[tail]=value;
		return true;	
	}
	public boolean deQueue() {
		if(isEmpty()==true) {
			return false;
		}
		if(head==tail) {
			head=-1;
			tail=-1;
			return true;
		}
		head=(head+1)%size;
		return true;
		
	}
	public boolean isEmpty() {
		return head==-1;
		
	}
	
	public boolean isFull() {
		return ((tail+1)%size)==head;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircularQueue q=new MyCircularQueue(5);
		q.enQueue(5);
		q.enQueue(3);
		q.enQueue(1);
		if(q.isEmpty()==false) {
			System.out.println(q.Front());
			System.out.println(Arrays.toString(q.data));
		}
		q.deQueue();
		if(q.isEmpty()==false) {
			System.out.println(q.Front());
			System.out.println(Arrays.toString(q.data));
		}
		q.deQueue();
		if(q.isEmpty()==false) {
			System.out.println(q.Front());
			System.out.println(Arrays.toString(q.data));
		}
		

	}

}

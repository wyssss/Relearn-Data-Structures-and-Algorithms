package day2;

import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new LinkedList();
		System.out.println("The first element is: "+q.peek());
		q.offer(5);
		q.offer(3);
		q.offer(1);
		q.poll();
		System.out.println("The first element is:"+q.peek());
		System.out.println("The size is:"+q.size());
	}

}

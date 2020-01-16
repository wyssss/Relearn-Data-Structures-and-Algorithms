package day2;

import java.util.Stack;

public class InternalStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(5);
		s.push(3);
		s.push(1);
		s.pop();
		System.out.println("The top element is:"+s.peek());
		System.out.println("The size is:"+s.size());

	}

}

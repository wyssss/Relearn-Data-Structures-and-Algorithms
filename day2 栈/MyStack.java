package day2;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List<Integer> data;//store elements
	public MyStack() {
		data=new ArrayList<>();
	}
	
	//Insert an element into the stack
	public void push(int x) {
		data.add(x);
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public int top() {
		return data.get(data.size()-1);
	}
	
	public boolean pop() {
		if(isEmpty()) {
			return false;
		}
		data.remove(data.size()-1);
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s=new MyStack();
		s.push(5);
		s.push(3);
		s.push(1);
		for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
		}
		

	}

}
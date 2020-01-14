package day1;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	private List<Integer> data;//存储的元素
	private int p_start;//标注起始位置的指针
	public Queue() {
		data=new ArrayList<Integer>();
		p_start=0;
	}
	//插入一个元素到队列中，插入成功则返回true
	public boolean enQueue(int x) {
		data.add(x);
		return true;
	}
	//从队列中删除一个元素，删除成功则返回true
	public boolean deQueue() {
		if(isEmpty()==true) {
			return false;
		}
		p_start++;
		return true;
	}
	//检查队列是否为空,不为空则返回false
	public boolean isEmpty() {
		return p_start>=data.size();
	}
    //获取队列前面的元素
	public int Front() {
		return data.get(p_start);
	}


	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(5);
		q.enQueue(3);
		q.enQueue(1);
		if(q.isEmpty()==false) {
			System.out.println(q.Front());
			System.out.println(q.data);
		}
		q.deQueue();
		if(q.isEmpty()==false) {
			System.out.println(q.Front());
			System.out.println(q.data);
		}
		q.deQueue();
		if(q.isEmpty()==false) {
			System.out.println(q.Front());
			System.out.println(q.data);
		}
		
		
	}
	}


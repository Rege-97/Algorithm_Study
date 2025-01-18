package algorithmStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {

	public static void main(String[] args) {
		// 스택과 큐
		
		Stack<String> stack= new Stack<String>();
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		Queue<String> queue=new LinkedList<String>();
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");

		System.out.println("==== Stack ====");
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		// LIFO 후입선출
		
		System.out.println("==== Queue ====");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		// FIFO 선입선출
		
		
	}

}

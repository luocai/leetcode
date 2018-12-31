package leetcode_12_31;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack_225 {
	
	private LinkedList<Integer> queue ;
	private LinkedList<Integer> helper;
	
	/** Initialize your data structure here. */
    public MyStack_225() {
        queue = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	while(!queue.isEmpty()){
    		int temp = queue.poll();
    		if(queue.isEmpty()){
    			LinkedList<Integer> q = queue;
    			queue = helper;
    			helper = q;
    			return temp;
    		}
    		helper.add(temp);
    	}
    	return 0;
    }
    
    /** Get the top element. */
    public int top() {
    	while(!queue.isEmpty()){
    		int temp = queue.poll();
    		helper.add(temp);
    		if(queue.isEmpty()){
    			LinkedList<Integer> q = queue;
    			queue = helper;
    			helper = q;
    			return temp;
    		}	
    	}
    	return 0;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
		
    	MyStack_225 m = new MyStack_225();
    	m.push(1);
    	m.push(2);
    	System.out.println(m.top());
    	System.out.println(m.pop());
    	System.out.println(m.empty());
	}
}

package leetcode;

import java.util.Stack;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }

public class ReorderList_143 {
	
	public void reorderList(ListNode head) {
        
		ListNode tail = head;
		Stack<ListNode> stack = new Stack<>();
		
		while(tail != null){
			stack.push(tail);
			tail = tail.next;
		}
		
		while(head != null){
			ListNode node = stack.pop();
			
			if(head.next == node){
				node.next = head.next;
				head.next = node;
				head = node.next;
				head.next = null;
				break;
			}
			if(head == node){
				head.next = null;
				break;
			}
			node.next = head.next;
			head.next = node;
			head = node.next;
		}
		
		
    }

}

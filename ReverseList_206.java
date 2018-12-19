package leetcode_12_19;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class ReverseList_206 {
	
	//迭代
//	public ListNode reverseList(ListNode head) {
//		
//		if(head == null)
//			return null;
//		
//		ListNode res = null;
//		
//		ListNode pre = head, tail = head.next;
//		
//		while(pre != null){
//			
//			pre.next = res;
//			res = pre;
//			pre = tail;
//			if(tail != null)
//				tail = tail.next;
//		}
//		
//		return res;
//    }
	
	//递归
	public ListNode reverseList(ListNode head) {
		
		
		
		return solution(null, head);
    }
	
	public ListNode solution(ListNode pre,ListNode cur){
		
		if(cur == null){
           
            return pre;
        }
			
		
		ListNode next = cur.next;
		
		cur.next = pre;
		pre = cur;
		
		cur =next;
		return solution(pre, cur);
	}

}

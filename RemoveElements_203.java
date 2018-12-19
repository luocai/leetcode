package leetcode_12_19;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class RemoveElements_203 {

	public ListNode removeElements(ListNode head, int val) {
        
		while(head != null && head.val == val){
			head = head.next;
		}
		if(head == null)
			return null;
		
		ListNode pre = head, cur = head.next;
		
		while(cur != null){
			
			if(cur.val == val){
				cur = cur.next;
				pre.next = cur;
			}else{
				cur = cur.next;
				pre = pre.next;
			}
		}
		
		return head;
    }

}

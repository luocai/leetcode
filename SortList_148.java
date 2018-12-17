package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class SortList_148 {
	
	
	public ListNode sortList(ListNode head) {
		
		if(head == null || head.next == null)
			return head;
		
		ListNode fast =head, slow = head;
		
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}

		fast = slow;
		slow = slow.next;
		fast.next = null;
		
		ListNode l1 = sortList(head);
		ListNode l2 = sortList(slow);
		
		return merge(l1, l2);
    }
	

	public ListNode merge(ListNode left, ListNode right){
		
		ListNode res = null ;
		
		
		if(left.val < right.val){
			res = left;
			left = left.next;
			
		}else{
			res = right;
			right = right.next;
		}
		
		ListNode r = res;
		
		
		while(left != null && right != null){
			
			if(left.val < right.val){
				res.next = left;
				res = res.next;
				left = left.next;
				
			}else{
				res.next = right;
				res = res.next;
				right = right.next;
				
			}	
		}
		
		while(left != null){
			res.next = left;
			res = res.next;
			left = left.next;
		}
		while(right != null){
			res.next = right;
			right = right.next;
			res = res.next;
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		ListNode head1 = new ListNode(2);
		ListNode head2 = new ListNode(1);
		ListNode head3 = new ListNode(3);
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = null;
		
		SortList_148 s = new SortList_148();
		
		ListNode res = s.sortList(head);
		
		while(res != null){
			System.out.print(res.val + " ");
			res = res.next;
		}
		
	}
	
//	public ListNode sort(ListNode head){
//		
//		if(head == null || head.next == null){
//			return head;
//		}
//		
//		ListNode fast = head, slow = head;
//		
//		while(fast.next != null && fast.next.next != null){
//			fast = fast.next.next;
//			slow = slow.next;
//		}
//		
//		//切断
//		fast = slow;
//		slow = slow.next ;
//		fast.next = null;
//		
//		ListNode l1 = sort(head);
//		ListNode l2 = sort(slow);
//		
//		return me(l1,l2);
//	}
//	
//	public ListNode me(ListNode left, ListNode right){
//		
//		ListNode r = null;
//		if(left.val < right.val){
//			r = left;
//			left = left.next;
//		}else{
//			r = right;
//			right = right.next;
//		}
//		
//		ListNode res = r;
//		
//		while(left != null & right != null){
//			if(left.val < right.val){
//				r.next = left;
//				r = r.next;
//				left = left.next;
//			}else{
//				r.next = right;
//				r = r.next;
//				right = right.next;
//			}
//		}
//		
//		while(left != null){
//			r.next = left;
//			r = r.next;
//			left = left.next;
//		}
//		while(right != null){
//			r.next = right;
//			r = r.next;
//			right = right.next;
//		}
//		
//		return res;
//		
//	}

}

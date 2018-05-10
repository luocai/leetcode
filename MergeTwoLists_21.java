package leetcode;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
      
  }
public class MergeTwoLists_21 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
		ListNode l3 = new ListNode(l1.val<l2.val ? l1.val : l2.val);
		l3.next = null;
		ListNode lt = l3;
		
		if(l1.val < l2.val){
			l1 = l1.next;
		}else{
			l2 = l2.next;
		}
		
		while(l1 != null && l2 != null){
			
			if (l1.val < l2.val){
				ListNode temp = new ListNode(l1.val);
				lt.next = temp;
				lt = temp;
				l1 = l1.next;
			}else{
				ListNode temp = new ListNode(l2.val);
				lt.next = temp;
				lt = temp;
				l2 = l2.next;
			}
		}
		
		while(l1 != null){
			
			ListNode temp = new ListNode(l1.val);
			lt.next = temp;
			lt = temp;
			l1 = l1.next;
		}
		
		while(l2 != null){
			ListNode temp = new ListNode(l2.val);
			lt.next = temp;
			lt = temp;
			l2 = l2.next;
		}
		
		return l3;
	}
	
	public void printL(ListNode l){
		while(l != null){
			System.out.print(l.val + " ");
			l = l.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		MergeTwoLists_21 m = new MergeTwoLists_21();
		
		ListNode l1 = new ListNode(-9);
		ListNode t1 = new ListNode(3);
		l1.next = t1;
		t1.next = null;
		/*ListNode t2 = new ListNode(5);
		t1.next = t2;
		t2.next = null;*/
		m.printL(l1);
		
		
		ListNode l2 = new ListNode(5);
		ListNode b1 = new ListNode(7);
		l2.next = b1;
		b1.next = null;
//		ListNode b2 = new ListNode(6);
//		b1.next = b2;
//		b2.next = null;
		m.printL(l2);
		
		ListNode l3 = m.mergeTwoLists(l1, l2);
		m.printL(l3);
	}

}

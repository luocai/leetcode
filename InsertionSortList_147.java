package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class InsertionSortList_147 {
	
//	public ListNode insertionSortList(ListNode head) {
//        
//		if(head == null)
//			return null;
//		
//		
//		ListNode p = head.next;
//		ListNode pre = head;
//	
//		while(p!= null){
//			
//			ListNode temp = p;
//			
//			ListNode tempre = head;
//			ListNode bef = head;
//			while(tempre != pre && temp.val > tempre.val){
//				
//				if(bef != tempre){
//					bef = bef.next;
//				}
//				tempre = tempre.next;
//			}
//			
//			if(tempre == bef){
//				temp.next = tempre.next;
//				tempre.next = temp;
//			}else{
//				temp.next = tempre;
//				bef.next = temp;
//			}
//			
//			
//			pre.next = p.next;
//			
//			p = p.next;
//			
//		}
//		
//		
//		
//		return head;
//    }
	
//	public ListNode insertionSortList(ListNode head) {
//        
//		ListNode helper = new ListNode(0);
//		
//		ListNode pre = helper;
//		ListNode cur = head;
//		
//		while(cur != null){
//			
//			pre = helper;
//			
//			ListNode tt = helper;
//			while(tt != null){
//				System.out.print(tt.val + " ");
//				tt = tt.next;
//			}
//			System.out.println();
//			while(pre.next != null && pre.next.val < cur.val){
//				pre = pre.next;
//			}
//			
//			
//			ListNode next =cur.next;
//			
//			cur.next = pre.next;
//			pre.next = cur;
//			cur = next;
//			
//			
//		}
//		return helper.next;
//	
//    }
	
	public ListNode insertionSortList(ListNode head) {
		
		//辅助数据，存储已经排好的
		ListNode helper = new ListNode(0);
		
		ListNode pre = helper;
		ListNode cur = head;
		
		while(cur != null){
			
			// 负责找打插入的的指针
			pre = helper;
			
			while(pre.next != null && pre.next.val < cur.val){
				pre = pre.next;
			}
			
			ListNode next = cur.next;
			
			cur.next = pre.next;
			pre.next = cur;
			
			cur = next;
		}
		
		return helper.next;
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
		
		InsertionSortList_147 s = new InsertionSortList_147();
		
		ListNode res = s.insertionSortList(head);
		
		while(res != null){
			System.out.print(res.val + " ");
			res = res.next;
		}
	}

}

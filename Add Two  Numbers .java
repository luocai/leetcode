/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        
        ListNode root = new ListNode(0);
        boolean flag = true;
        root.next = null;
        
        ListNode r = root;
        
        int carry = 0;
        while(l1!=null && l2!=null){
            int sum = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            
            ListNode node = new ListNode(sum);
            node.next = null;
            
            if (flag == true){
                root = node;
                r = root;
                flag = false;
            }else{
                root.next = node;
                root = node;
            } 
            l1 = l1.next; 
            l2 = l2.next;
        }
        while(l1!=null){
            int sum = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            
            ListNode node = new ListNode(sum);
            node.next = null;
            root.next = node;
            root = node;
            l1 = l1.next; 
        }
        while(l2!=null){
            int sum = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            
            ListNode node = new ListNode(sum);
            node.next = null;
            root.next = node;
            root = node;
            l2 = l2.next;
        }
        if (carry != 0){
        	ListNode node = new ListNode(carry);
        	node.next = null;
        	root.next = node;
        }
        return r;
        
    }
    
   
}
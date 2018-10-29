package leetcode;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
	}
}
public class SortedListToBST_109 {
	
	public TreeNode sortedListToBST(ListNode head) {
		
		if(head == null){
			return null;
		}
		
		List<Integer> treeList = new ArrayList<>();
		while(head != null){
			treeList.add(head.val);
			head = head.next;
		}
		
		return buildTree(treeList,0,treeList.size()-1);
    }
	
	private TreeNode buildTree(List<Integer> treeList, int low, int high){
		
		if( low > high)
			return null;
		
		int mid = (low + high) / 2;
		
		TreeNode root = new TreeNode(treeList.get(mid));
		
		root.left = buildTree(treeList, low, mid-1);
		root.right = buildTree(treeList, mid + 1, high);
		
		return root;
		
	}
	
	
	
	

}

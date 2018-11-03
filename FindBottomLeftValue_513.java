package leetcode;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
	}
}
public class FindBottomLeftValue_513 {
	
	public int findBottomLeftValue(TreeNode root) {
        
		int res = root.val;
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		int size = 1;
		queue.add(root);
		while(!queue.isEmpty()){
			
			TreeNode node = queue.poll();
			size--;
			
			if(node.left != null){
				queue.add(node.left);
			}
			if(node.right != null){
				queue.add(node.right);
			}
			
			if(size == 0){
				if(!queue.isEmpty())
					res = queue.peek().val;
				size = queue.size();
			}
			
		}
		
		return res;
    }
}

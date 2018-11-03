package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
	}
}
public final class LargestValues_515 {
	
	public List<Integer> largestValues(TreeNode root) {
        
		List<Integer> res = new ArrayList<Integer>();
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(root != null){
			
			queue.add(root);
			int size = 1;
			int tempMax = Integer.MIN_VALUE;
			
			while(!queue.isEmpty()){
				
				TreeNode node = queue.poll();
				size--;
				tempMax = Math.max(tempMax, node.val);
				
				if(node.left!= null){
					queue.add(node.left);
				}
				if(node.right != null){
					queue.add(node.right);
				}
				
				if(size == 0){
					res.add(new Integer(tempMax));
					size = queue.size();
					tempMax = Integer.MIN_VALUE;
				}
				
			}
			
		}
		return res;
    }
	
	

}

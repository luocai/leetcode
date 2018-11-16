package leetcode;

import java.util.ArrayList;
import java.util.List;

 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
public class InorderTraversal_94 {

	public List<Integer> inorderTraversal(TreeNode root) {
        
		List<Integer> res = new ArrayList<>();
		solution(root,res);
		
		return res;
		
    }
	
	public void solution(TreeNode root,List<Integer> res){
		
		if(root == null)
			return;
		
		solution(root.left,res );
		res.add(root.val);
		solution(root.right, res);
		
	}
}

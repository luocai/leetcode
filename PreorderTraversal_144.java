package leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class PreorderTraversal_144 {
	
	public List<Integer> preorderTraversal(TreeNode root) {
        
		List<Integer> res = new ArrayList<>();
		solution(res,root);
		
		return res;
    }
	
	public void solution(List<Integer> res, TreeNode node){
		
		if(node == null)
			return;
		
		res.add(node.val);
		solution(res,node.left);
		solution(res,node.right);
		
	}

}

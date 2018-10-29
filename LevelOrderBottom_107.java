package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int val){
//		this.val = val;
//	}
//}
public class LevelOrderBottom_107 {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		
		List<List<Integer>> res = new ArrayList<>();
		

		
		dfs(res, 0, root);
		
		Collections.reverse(res);
		
		return res;
    }
	
	public void dfs(List<List<Integer>> res, int height, TreeNode root){
		
		if(root == null)
			return;
		
		if(res.size()-1 < height){
			res.add(new ArrayList<>());
		}
		res.get(height).add(root.val);
		
		dfs(res, height +1,root.left);
		dfs(res, height +1,root.right);
		
	}
	
	private int getHeight(TreeNode root){
		
		if(root == null){
			return 0;
		}
		
		return Math.max(getHeight(root.left) + 1, getHeight(root.right) + 1);
		
	}

}

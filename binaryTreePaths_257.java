package leetcode_12_30;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class binaryTreePaths_257 {
	
	public List<String> binaryTreePaths(TreeNode root) {
        
		
		List<String> res = new ArrayList<String>();
		
		if(root == null)
			return res;
		
		solution(root,res, "");
		return res;
		
    }
	
	public void solution(TreeNode node, List<String> res,String s){
		
		if(s.length() == 0)
			s += node.val;
		else
			s = s + "->" + node.val;
		if(node.left == null && node.right == null){
			
			res.add(new String(s));
			return;
		}
			
		
		if(node.left != null)
			solution(node.left,res, s);
		if(node.right != null)
			solution(node.right,res, s);
		
	}

}

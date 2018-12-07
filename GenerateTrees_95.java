package leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	  int val;
	  TreeNode left;
	  TreeNode right;
	  TreeNode(int x) { 
		  val = x;
	  }
}
public class GenerateTrees_95 {
	

	public List<TreeNode> generateTrees(int n) {
        
		List<TreeNode> res = new ArrayList<>();
		
		if(n <= 0)
			return res;
		
		
		return solution(1,n);
    }
	
	public List<TreeNode> solution(int start, int end){
		
		List<TreeNode> res = new ArrayList<>();
		
		if(start > end){
			res.add(null);
			return res;
		}
		
		for(int root = start; root < end; root++){
			
			for(TreeNode lefts: solution(0,start-1)){
				
				for(TreeNode rights: solution(start+1, end)){
					TreeNode node = new TreeNode(root);
					node.left = lefts;
					node.right = rights;
					res.add(node);
				}
			}
			
		}
		
		
		return res;
	}
 
}

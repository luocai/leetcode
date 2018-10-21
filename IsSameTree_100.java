package leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
	  int val;
	  TreeNode left;
	  TreeNode right;
	  TreeNode(int x) { 
		  val = x;
	  }
}
public class IsSameTree_100 {
	
	  public boolean isSameTree(TreeNode p, TreeNode q) {
		  
		  if(p!=null && q != null){
			  
			  if(p.val != q.val){
				  return false;
			  }else{
				  return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);				  
			  }
			  
		  }else{
			  if(p==null && q==null){
				  return true;
			  }else{
				  return false;
			  }
		  }
		  
		  
	  }

}

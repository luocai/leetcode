package leetcode;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { 
		  val = x;
	}
}
public class SumOfLeftLeaves_404 {

	public int sumOfLeftLeaves(TreeNode root) {
        
		if(root == null)
			return 0;
		
		return solution(root,root.left) + solution(root,root.right);
    }
	
	public int solution(TreeNode parent, TreeNode node){
		
		if( node == null)
			return 0;
		
		if(node.left == null && node.right == null){
			if(parent.left == node){
				return node.val;
			}else{
				return 0;
			}
		}
		
		
		return solution(node,node.left) + solution(node, node.right);
		
	}
}

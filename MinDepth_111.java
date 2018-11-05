package leetcode;


class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
	}
}
public class MinDepth_111 {
	
	public int minDepth(TreeNode root) {
		
		if(root == null)
			return 0;
		
		return solution(0,root);
    }
	
	public int solution(int height, TreeNode node){

		
		if(node.left == null && node.right == null){
			return height + 1;
		}
		
		int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
		
		if(node.left != null)
			left = solution(height+1,node.left);
		if(node.right != null)
			right = solution(height+1, node.right);
		
		return Math.min(left,right);
		
	}

}

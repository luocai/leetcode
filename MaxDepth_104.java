package leetcode;

//class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int val){
//		this.val = val;
//	}
//}
public class MaxDepth_104 {
	
	public int maxDepth(TreeNode root) {
		
		if(root == null){
			return 0;
		}
		
		return Math.max(maxDepth(root.left) + 1, maxDepth(root.right)+1 );

    }

}

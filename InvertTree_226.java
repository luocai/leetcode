package leetcode_12_19;

import leetcode_12_18.TreeNode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class InvertTree_226 {
	
	public TreeNode invertTree(TreeNode root) {
        
		if(root == null)
			return null;
		
		TreeNode left = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(left);
		
		return root;
    }

}

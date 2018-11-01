package leetcode;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
	}
}

public class HasPathSum_112 {
	
	public boolean hasPathSum(TreeNode root, int sum) {
		
		if(root == null)
			return false;
		return solution(root,0,sum);
    }
	
	public boolean solution(TreeNode node, int curSum, int sum){
		
		if(node == null)
			return false;
		
		if(node.left == null && node.right == null){
			if(curSum+node.val == sum)
				return true;
			else
				return false;
		}
		
		return solution(node.left,curSum+node.val, sum) || solution(node.right,curSum + node.val,sum);
	
	}
}

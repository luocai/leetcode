package leetcode;

//class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int val){
//		this.val = val;
//	}
//}
public class IsSymmetric_101 {
	
	public boolean isSymmetric(TreeNode root) {
		
		if(root == null){
			return true;
		}
		
		return isSymmetricUtil(root.left,root.right );
		
    }
	
	private boolean isSymmetricUtil(TreeNode left, TreeNode right){
		
		if(left != null && right !=null){
			if(left.val != right.val){
				return false;
			}else{
				return isSymmetricUtil(left.right,right.left) && isSymmetricUtil(left.left,right.right);
			}
		}
		
		if(left == null && right == null){
			return true;
		}
		return false;
		
		
		
	}

}

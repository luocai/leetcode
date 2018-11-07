package leetcode;


class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
		left = null;
		right = null;
	}
}
public class Rob_337 {
	
	public int rob(TreeNode root) {
        
		int x = solution(root,true);
		int y = solution(root,false);
//		System.out.println("x:" + x+" y:" + y);
		return Math.max(x, y);
//		return Math.max(solution(root,true),solution(root,false));
    }
	
	public int solution(TreeNode node, boolean isSelected){
		
		if(node == null)
			return 0;
		
		int left = 0,right = 0;
		
		if(isSelected == true){
			left =  solution(node.left,false);
			right = solution(node.right,false);
			return left + right + node.val;
			
		}else{
			left =  Math.max(solution(node.left,true),solution(node.left,false) );
			right = Math.max(solution(node.right,true),solution(node.right,false) );
			return left + right;
		}

		
		
	}
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(1);
		
		root.left = node1;
		root.right = node2;
		node1.right = node3;
		node2.right = node4;
		
		Rob_337 r = new Rob_337();
		int x = r.rob(root);
		System.out.println(x);
	}

}

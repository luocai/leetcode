package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int val){
//		this.val = val;
//	}
//}
public class LevelOrder_102 {

	
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> res = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(root != null){
			int width = 1;
			List<Integer> tempRes = new ArrayList();
			queue.add(root);
			while(!queue.isEmpty()){
				TreeNode node = queue.poll();
				tempRes.add(node.val);
				width--;
				System.out.println(node.val);
				if(node.left != null){
					queue.add(node.left);
				}
				if(node.right != null){
					queue.add(node.right);
				}
				if(width== 0){
					width = queue.size();
					res.add(tempRes);
					tempRes = new ArrayList<>();
				}
			}
			
			
			
		}
		return res;
        
    }
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        
        tree.left = node2;
        tree.right = node1;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        
        LevelOrder_102 l = new LevelOrder_102();
        l.levelOrder(tree);
	}

}

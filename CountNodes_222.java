package leetcode_12_18;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}

public class CountNodes_222 {
	
	//bfs 超时
//	public int countNodes(TreeNode root) {
//
//		if(root == null)
//			return 0;
//		
//		
//		Queue<TreeNode> queue = new LinkedList<>();
//		queue.add(root);
//		int size = queue.size();
//		
//		int res = 0;
//		
//		while(!queue.isEmpty()){
//			
//			TreeNode node = queue.poll();
//			size--;
//			res++;
//			
//			
//			if(node.left != null)
//				queue.add(node.left);
//			if(node.right != null)
//				queue.add(node.right);
//			
//			if(size == 0){
//				size = queue.size();
//			}
//		}
//		
//		
//		return res;
//    }
	
	public int countNodes(TreeNode root) {

		if(root == null)
			return 0;
		
		TreeNode left = root;
		TreeNode right = root;
		int h = 0;
		
		while(right != null){
			left = left.left;
			right = right.right;
			h++;
		}
		
		
		if(left == null){
			return (1 << h) - 1;
		}else{
			return countNodes(root.left) + countNodes(root.right) + 1;
		}
	
	
    }
	
	
	
	//dfs 超时  没有利用完全二叉树的性质 （左子树右子树必定有一个 满二叉树
//	public int solution(TreeNode root){
//		
//		if(root == null)
//			return 0;
//		
//		
//		return solution(root.left) + solution(root.right) + 1;
//	}
}

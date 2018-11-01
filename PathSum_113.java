package leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
	}
}

public class PathSum_113 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
		List<List<Integer>> res = new ArrayList<>();
		
		
		
		return null;
    }
	
	public void solution(List<List<Integer>> res,List<Integer> tmpRes,TreeNode node,int curSum ,int sum){
		
		if(node == null)
			return;
		
		if(node.left == null && node.right == null){
			if(curSum + node.val == sum){
				res.add(new ArrayList<>(tmpRes));
			}else{
				return;
			}
		}
		
		solution(res,new ArrayList<>(tmpRes).add(node.val),node.left,curSumsum);
		
	}
}

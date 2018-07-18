package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_40 {

	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        
		Arrays.sort(candidates);
		
		List<Integer> res = new ArrayList();
		
		List<List<Integer>> result = new ArrayList();
		
		
		
		slove(candidates,result,0,res,0,target);
	
		return result;
	}
	
	public void slove(int [] candidtes, List<List<Integer>> result,int index, List<Integer> res,int sum,int target){
		
		if(sum == target){
			boolean flag = true;
			for(List<Integer> x: result){
				if(x.equals(res)){
					flag = false;
					break;
				}
			}
			if(flag == true)
				result.add(new ArrayList<>(res));
		}
		
		if(sum > target || index >= candidtes.length || candidtes[index] > target){
			return;
		}
		
		res.add(candidtes[index]);
		slove(candidtes, result,index+1,res,sum+candidtes[index],target);
		res.remove(res.size()-1);
		slove(candidtes,result,index+1,res,sum,target);
		
	}
	
	 
	public static void main(String[] args) {
		
		
		int[] a = {10,1,2,7,6,1,5};
		
		CombinationSum_40 c = new CombinationSum_40();
		
		List<List<Integer>> result = c.combinationSum2(a,8);
		
		for(List<Integer> x: result){
			System.out.println(x);
		}
	}

}

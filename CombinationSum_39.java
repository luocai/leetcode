package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_39 {

	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
		List<List<Integer>> result = new ArrayList();
		Arrays.sort(candidates);
		
		solve(result, new ArrayList<>(), 0,candidates, 0,target);
		
		return result;
    }
	
	public void solve(List<List<Integer>> result,List<Integer> res,int sum,int [] canditates,int index, int target){
		
		if(sum == target){
			result.add(new ArrayList(res));
			return;
		}
		
		if(sum > target || index >= canditates.length || canditates[index] > target){
			return;
		}
		
		res.add(canditates[index]);
		solve(result, res, sum+canditates[index],canditates, index, target);
		res.remove(res.size()-1);
		solve(result, res, sum, canditates, index+1, target);
		
	}
	public static void main(String[] args) {
		
		CombinationSum_39 c = new CombinationSum_39();
		
		int[] can = {2,3,6,7};
		
		List<List<Integer>> res = c.combinationSum(can, 6);
		
		for(int i = 0; i < res.size(); i++){
			System.out.println(res.get(i));
		}

	}
		
		
}

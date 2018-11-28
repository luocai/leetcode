package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetsWithDup_90 {
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        
		List<List<Integer>> res = new ArrayList<>();
		
		List<Integer> tempRes = new ArrayList();
		
		solution(res, tempRes, 0, nums);
		
		return res;
    }
	
	public void solution(List<List<Integer>> res, List<Integer> tempRes, int index, int[] nums){
		
		
		if(index == nums.length){
			Collections.sort(tempRes);
			if(!res.contains(tempRes)){
				res.add(tempRes);
				tempRes = new ArrayList<>();
				
			}
			return;
		}
		
		
		List<Integer> temp = new ArrayList(tempRes);
		solution(res, temp, index +1,nums);
		
		tempRes.add(nums[index]);
		
		solution(res,tempRes, index+1, nums);
		
	}

}

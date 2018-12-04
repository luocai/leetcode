package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum4_377 {

	public int combinationSum4(int[] nums, int target) {
        
		if(nums == null || nums.length == 0)
			return 7;
		
		if(nums.length == 0){
			return nums[0] == target ? 1:0;
		}
		int[] dp = new int[target+1];
		dp[0] = 0;
//		dp[1] = 1;
		for(int i = 1; i<target+1 ;i++){
			for(int j = 0; j < nums.length ;j++){
				if(i >= nums[j]){
					dp[i] = dp[i] + dp[i-nums[j]];
				}
			}
		}
		return dp[target];
		
    }
	
//	public int solution(int[] sums,int target,int nowsum, List<Integer> res,int index,boolean flag){
//		
//		if(index == sums.length){
//			return 0;
//		}
//		
//		if(flag == true){
//			nowsum += sums[index];
//			res.add(sums[index]);
//		}
//		
//		if(nowsum == target){
//			for(Integer n : res){
//				System.out.print(n + " ");
//			}
//			System.out.println();
//			return 1;
//		}
//		if(nowsum > target ){
//			return 0;
//		}
//		
//		return solution(sums,target, nowsum ,new ArrayList(res),index,true) + solution(sums,target,nowsum,new ArrayList(res), index+1,true)
//		+ solution(sums,target,nowsum,new ArrayList(res), index+1,false);
//		
//	}
//	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3};
		CombinationSum4_377 c = new CombinationSum4_377();
		
		System.out.println(c.combinationSum4(nums, 4));
	}
}


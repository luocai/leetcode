package dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rob_213 {

	public int rob(int[] nums){

		
//		return solution(nums,0,nums.length);
//		return solutionSearch(nums, 0, nums.length);
		return solutiondp(nums);
	}
	
	//递归
	public int solution(int[] nums, int index,int end){
		
		if(index >= end)
			return 0;
		
		int res = 0;
		
		if(index == 0){
	
			res = Math.max(nums[index] + solution(nums,index+2, nums.length-1),res);
	
		}
		for(int i = index; i <end ;i++){
			if(i == 0)
				continue;
			res = Math.max(nums[i]+solution(nums,i+2,end), res);
		}
		
		return res;
		
	}
	
	Map<String, Integer> map = new HashMap<>();
	//记忆化搜索
	public int solutionSearch(int[] nums, int index,int end){
		
		
		
		if(index >= end)
			return 0;
		
		String key = String.valueOf(index) + String.valueOf(end);
		if(map.containsKey(key)){
			return map.get(key);
		}
			
		int res = 0;
		
		if(index == 0){
	
			res = Math.max(nums[index] + solutionSearch(nums,index+2, nums.length-1),res);
	
		}
		for(int i = index; i <end ;i++){
			if(i == 0)
				continue;
			res = Math.max(nums[i]+solutionSearch(nums,i+2,end), res);
		}
		
		map.put(key, res);
		return res;
		
	}
	
	//Dp
	public int solutiondp(int[] nums){
		
		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return nums[0];
		if(nums.length == 2)
			return Math.max(nums[0], nums[1]);
		
		return Math.max(robdp(nums,0,nums.length-1), robdp(nums,1,nums.length));
	}
	
	public int robdp(int[] nums,int start, int end){
		
		int[] dp = new int[end-start];
		
		dp[0] = nums[start];
		dp[1] = nums[start+1] > nums[start] ? nums[start+1] : nums[start];
		
		
		for(int k = start + 2, i = 2; i < dp.length && k < end; i++,k++){
			
			dp[i] = Math.max(dp[i-1], dp[i-2] + nums[k]);
		}
		
		return dp[end-start-1];
	}
	
	public static void main(String[] args) {
		Rob_213 r = new Rob_213();
	
//		int[] a = {6,6,4,8,4,3,3,10};
		int[] a = {2,1,1,1};
		
		Integer i1 = 111;
		Integer i2 = 111;
		
		System.out.println(i1 == i2);
		
//		System.out.println(r.rob(a));
	}
}

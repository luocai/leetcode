package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CanPartition_416 {
	
	private Map<String,Boolean> cache = new HashMap<>();
	
	public boolean canPartition(int[] nums) {
        
		int sum = 0;
		for(int i = 0; i < nums.length ; i++){
			sum += nums[i];
		}
		
		if(nums.length <2 || sum % 2 != 0)
			return false;
		
		int w = sum /2;
		boolean[] dp = new boolean[w+1];
		dp[0] = true;
		
		Arrays.sort(nums);
		
		for(int num:nums){
			
			for(int j = w; j >= num; j--){
				dp[j] = dp[j] || dp[j-num];
			}
			
		}
		
		return dp[w];
		
//		return solution(nums,0,true,nums[0],sum) || solution(nums,0,false,0,sum);
    }
	
	public boolean solution(int[] nums,int index,boolean flag,int nowSum,int sum){
		
//		String key = index + "-" + flag +"-" + nowSum;
		
//		if(cache.containsKey(key)){
////			System.out.println("缓存啦...");
//			return cache.get(key);
//		}
		
		if(index == nums.length-1){
			if(nowSum*2 == sum){
//				cache.put(key, true);
				return true;
			}else{
//				cache.put(key, false);
				return false;
			}
		}
		
		return solution(nums,index+1, true, nowSum+nums[index+1], sum) || solution(nums,index+1, false, nowSum, sum);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 5,11, 5};
		CanPartition_416 c = new CanPartition_416();
		
		System.out.println(c.canPartition(a));
	}
	
	
}

package leetcode;

public class Rob_198 {
	
//	暴力搜索 超时
//	public int rob(int[] nums) {
//
//        return Math.max(solution(0,nums,true),solution(0,nums,false));
//    }
//	
//	public int solution(int i,int[] nums, boolean flag){
//		
//		if(i >= nums.length)
//			return 0;
//		
//		if(flag == false)
//			return Math.max(solution(i+1,nums,true) + nums[i], solution(i+1,nums,false));
//		else
//			return solution(i+1, nums, false);		
//	}
	
	
//	dp[0] = 1;
//	dp[1] = 1;
//	dp[i] = d[i-1] 
//	dp[i] = d[i-2] + a[i]
//	dp
	public int rob(int[] nums) {
		
		if(nums.length == 0)
			return 0;
		
		if(nums.length == 1)
			return nums[0];
		
//		if(nums.length == 2)
//			return Math.max(nums[0], nums[1]);
//		
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		
		
		for(int i = 2; i < nums.length; i++){
			
			dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
		}
        return dp[nums.length-1];
    }
	

	public static void main(String[] args) {
		
		int[] nums =  {0};
		Rob_198 r = new Rob_198();
		System.out.println(r.rob(nums));
	}
}

package leetcode;

public class LengthOfLIS_300 {
	
	public int lengthOfLIS(int[] nums) {
	    
		
		int[] dp = new int[nums.length];
		
		int max = 0;
		
	
		
		for(int i = 0; i < nums.length; i++){
			
			dp[i] = 1;
			for(int j = 0; j < i; j++){
				
				if(nums[i] > nums[j]){
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
				
			}
			max = Math.max(dp[i], max);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		int[] a = {10,9,2,5,3,7,101,18};
		LengthOfLIS_300 l = new LengthOfLIS_300();
		System.out.println(l.lengthOfLIS(a));
	}

}

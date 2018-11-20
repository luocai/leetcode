package leetcode;

public class CountBits_338 {
	
	//  dp[i] = dp[i>>1] + i % 2;
	// 即 一个数与他右移一位的1的个数（除了个位数）相等
	
	public int[] countBits(int num) {
        
		int[] dp = new int[num+1];
		dp[0] = 0;
		
		for(int i = 1; i <= num; i++){
			
			dp[i] = dp[i>>1] + i % 2;
			
		}
		
		return dp;
    }

}

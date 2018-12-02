package leetcode;

public class IntegerBreak_343 {
	
	public int integerBreak(int n) {
        
		int[] dp = new int[n+1];
		
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i = 3; i <=n; i++){
			dp[i] = 0;
			for(int j = 0; j < i; j++){
				dp[i] = Math.max(dp[i-j]*j, Math.max(dp[i], (i-j)*j));
			}
		}
		
		return dp[n];
    }
	
	public static void main(String[] args) {
		IntegerBreak_343 i = new IntegerBreak_343();
		
		for(int j = 3; j <= 10; j++)
			System.out.println(i.integerBreak(j));
	}

}

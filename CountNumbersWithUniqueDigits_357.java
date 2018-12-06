package leetcode;

public class CountNumbersWithUniqueDigits_357 {
	
	public int countNumbersWithUniqueDigits(int n) {
        
		if(n == 0)
			return 1;
		
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 9;

		
		for(int i = 2; i <= n ;){
			if(11 - i == 0){
				while(i <= n){
					dp[i] = dp[i-1];
				}
				break;
			}
				
			dp[i] = dp[i-1] + (dp[i-1] - dp[i-2])*(11-i);
			i++;
		}
		
		return dp[n]+1;
    }
	
	public static void main(String[] args) {
		CountNumbersWithUniqueDigits_357 c = new CountNumbersWithUniqueDigits_357();
		
		System.out.println(c.countNumbersWithUniqueDigits(2));
		
		
		
		
	}

}

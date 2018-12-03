package leetcode;

public class NumberOfArithmeticSlices_413 {

	
	public int numberOfArithmeticSlices(int[] A) {
        if(A == null || A.length == 0){
			return 0;
		}
        
        
		int length = A.length;
        
        if(length <= 2)
            return 0;
		
		//dp[i] 表示以 i结尾的子等差数列的个数
		int[] dp = new int[length];
		
		dp[0] = 0;
		dp[1] = 0;
		
		for(int i = 2;i < length; i++){
			
			// 如果 符合等差数列
			if(A[i]-A[i-1] == A[i-1] - A[i-2]){
				//以i 结尾的等差子序列个数 = dp[i-1](即在原来的序列上增加一个A[i]) + 1(A[0],A[1],A[i])
				dp[i] = dp[i-1] + 1;
			}
			
		}
		
		int res = 0;
		
		for(int i = 0; i < length ; i++){
			res+= dp[i];
		}
		
		return res;
    }
}

package leetcode;

public class MaximalSquare_221 {
	
	// dp[i][j] 表示 以 matrix[i][j] 为右下角的最大结果
	public int maximalSquare(char[][] matrix) {
        
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return 0;
		
		int[][] dp = new int[matrix.length][matrix[0].length];
		
		int max = 0;
		
		for(int i = 0; i < matrix.length ; i++){
			
			for(int j = 0; j < matrix[i].length; j++ ){
				
				if(i == 0 || j == 0){
					if(matrix[i][j] == '1')
						dp[i][j] = 1;
					else
						dp[i][j] = 0;
					
					
				}else{
					if(matrix[i][j] == '1'){
						// dp[i][j] 的值和上，左，左上的值有关
						int up = dp[i-1][j];
						int left = dp[i][j-1];
						
						int up_left = dp[i-1][j-1];				
						
						dp[i][j] = Math.min(up,Math.min(left, up_left)) + 1;				
						
					}else{
						dp[i][j] = 0;
					}
				}
				if(max < dp[i][j])
					max = dp[i][j];		
			}
			
		}
		
		return max*max;
    }

}

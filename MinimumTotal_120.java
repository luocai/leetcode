package leetcode;

import java.util.List;

public class MinimumTotal_120 {
	
	//从下往上进行dp  分别计算每行的每个顶点以下的最小值
	public int minimumTotal(List<List<Integer>> triangle) {
        
		int m = triangle.size();
		
		int[] dp = new int[m+1];
		
		for(int i = m-1; i >= 0 ;i--){
			List<Integer> tmp = triangle.get(i);
			for(int j = 0; j < tmp.size() ;j++){
				dp[j] = Math.min(dp[j], dp[j+1]) + tmp.get(j);
			}
		}
		
		return dp[0];
    }

}

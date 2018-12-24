package leetcode_12_22;

import java.util.HashMap;
import java.util.Map;

public class FindMaxForm_474 {

	//Dp
	public int findMaxForm(String[] strs, int m, int n) {
        
		int[][] dp = new int[m+1][n+1];
		
		dp[m][n] = 0;
		
		int res = 0;
		
		for(int i = 0; i < strs.length; i++){
			
			int ms = getNum(strs[i], '0');
			int ns = getNum(strs[i],'1');
			
			for(int j = m; m > ms; j--){
				for(int k = n; k > ns; k--){
					dp[j][k] = Math.max(dp[i][k], dp[i-ms][j-ns] + 1);
				}
			}
		}
		
		return dp[m][n];
    }

	Map<String,Integer> map = new HashMap<>();
	// 递归
	public int solution(String[] strs, int index, int m, int n,int res){
		
		if(m < 0 || n < 0)
			return 0;
		
		if(index == strs.length-1)
			return res;
		
		String s = strs[index];
		
		int ms = getNum(s,'0');
		int ns = getNum(s,'1');
		return Math.max(solution(strs,index+1,m,n,res), solution(strs,index+1,m-ms,n-ns,res+1));
		
	}
	
	public int getNum(String s,char tar){
		int count = 0;
		for(int i = 0; i< s.length() ;i++)
			if(s.charAt(i) == tar)
				count++;
	
		return count;
	}
	
	

}

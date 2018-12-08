package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumDistinct_115 {
	
	
	
	
	//思考二维数组，走地图类型，从起点走到右下角的那题
	public int numDistinct(String s, String t) {
        
		int[][] dp = new int[s.length()+1][t.length()+1]; // dp[i][j] 表示 s的前i位子串 和 t的前j为匹配的个数
		
		dp[0][0] = 1;
		for(int i = 1; i < s.length();i++){
			dp[i][0] = 1;
		}
		
		for(int i = 1; i < t.length();i++){
			dp[0][i] = 0;
		}
		
		for(int i = 1; i <= s.length(); i++){
			for(int j = 1; j <= t.length() ;j++){
				dp[i][j] = dp[i-1][j];
				System.out.println("i:"+i+" j:" + j);
				if(t.charAt(j-1) == s.charAt(i-1)){
					dp[i][j]  += dp[i-1][j-1];
				}
				
			}
		}
        
		return dp[s.length()][t.length()];
//        return solution(s,t,0,0);
    }
    
	//递归
//    public int solution(String s, String t, int i, int j){
//        
//        if(j == t.length()){
//        	return 1;
//        }
//        if(i == s.length()){
//        	return 0;
//        }
//        
//        if(s.charAt(i) == t.charAt(j)){
//            return solution(s,t,i+1,j+1) + solution(s,t,i+1,j);
//        }else{
//            return solution(s,t,i+1,j);
//        }
//     
//    }
    
    public static void main(String[] args) {
		
    	NumDistinct_115 m = new NumDistinct_115();
    	
    	System.out.println(m.numDistinct("babgbag", "bag"));
	}

}

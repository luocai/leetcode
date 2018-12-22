package leetcode_12_22;

public class NumDecodings_91 {
	
	public int numDecodings(String s) {
        
		
		int[] dp = new int[s.length()];
		
		dp[s.length()-1] = 1;
		
		if(s.charAt(s.length()-1) == '0'){
			dp[s.length()-1] = 0;
		}
		
		for(int i = s.length()-2; i>= 0 ; i--){
			if(s.charAt(i) == '0'){
				if(s.charAt(i+1) == '0')
					return 0;
				
				continue;
			}
				
			if(judgeValue(s.charAt(i),s.charAt(i+1))){
				
				if(i+2 <=s.length()-1 && s.charAt(i+2) == '0'){
					dp[i] = dp[i+1];
				}else{
					dp[i] = dp[i+1] + 1;
				}
				
			}else{
				//如果 == 两位数还是0  或者 两位数 > 26 且是10的倍数
//				if(getValue(s.charAt(i), s.charAt(i+1)) == 0|| (getValue(s.charAt(i), s.charAt(i+1)) % 10 == 0 && dp[i+1] != 0))
//					return 0;
				
				if(getValue(s.charAt(i), s.charAt(i+1)) == 0
						|| (getValue(s.charAt(i), s.charAt(i+1)) > 26 && i == s.length()-2 && dp[i+1] == 0)
						||(getValue(s.charAt(i), s.charAt(i+1)) % 10 == 0 && i!=s.length() - 2))
					return 0;
				
				dp[i] = dp[i+1];
				if(dp[i] == 0)
					dp[i] = 1;
			}
			
		}
		
		return dp[0];
    }
	
	public boolean judgeValue(char a, char b){
		
		int t = (a - '0') * 10 + (b - '0');
		
		return t <= 26 && t % 10 != 0;
	}
	
	public int getValue(char a, char b){
		int t = (a - '0') * 10 + (b - '0');
		return t;
	}
	
	public static void main(String[] args) {
		
		NumDecodings_91 n = new NumDecodings_91();
		
		System.out.println(n.numDecodings("101"));
	}

}

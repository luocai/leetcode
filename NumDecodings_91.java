package dp;

public class NumDecodings_91 {
	
	public int numDecodings(String s) {
	
		
//		return solution(s);
		return solutionDp(s);
	}
	
	//
	public int solution(String s){
		
		
		
		if(s.length() == 0){
			return 1;
		}
		
		int res = 0;
		
		char a = s.charAt(0);
		char b = '#';
		
		if(1 < s.length())
			b = s.charAt(1);
		
		if(a-'0' > 0){
			res += solution(s.substring(1, s.length()));
		}
			
		if(b != '#'){
			if(judgeValue(a, b))
				res += solution(s.substring(2,s.length()));
			else
				return 0;
		}
		
		
		return res;
	}
	
	public int solutiondp(String s){
		
		int[] dp = new int[s.length()];
		
		if(s.length() == 0 || s.charAt(0) == '0')
			return 0;
		else
			dp[0] = 1;
		
		for(int i = 1 ; i< s.length() ; i++){
			
			char a = s.charAt(i);
			char b = s.charAt(i-1);
			
			if( a - '0' > 0){
				dp[i] = dp[i-1];
			}
			
			if(judgeValue(b, a)){
				
				if(getValue(b, a) % 10 == 0){
					
					if( i-2 >= 0 && dp[i-1] >dp[i-2] ){
						dp[i] = dp[i-1] -1;
					}else{
						dp[i] = dp[i-1];
					}
					
					System.out.println("..");
				}		
				else
					dp[i] = dp[i-1] + 1;
			}
		}
		
		return dp[s.length()-1];
	}
	
	//正确做法
	public int solutionDp(String s){
		
		int[] dp = new int[s.length()];
		
		if(s.length() == 0 || s.charAt(0) == '0')
			return 0;
		else
			dp[0] = 1;
		
		for(int i = 1 ; i< dp.length ; i++){
			
			if(s.charAt(i-1) != '0')
				dp[i] += dp[i-1];
			
			if( i >= 2 && getValue(s.charAt(i-2), s.charAt(i-1)) <= 26 && getValue(s.charAt(i-2), s.charAt(i-1)) >= 10){
				dp[i] += dp[i-2];
			}
		}
		return dp[s.length()-1];
	}
	public static void main(String[] args) {
		NumDecodings_91 m = new NumDecodings_91();
		
		System.out.println(m.numDecodings("1212"));
	}
	
	public boolean judgeValue(char a, char b){
		
		if(a == '0')
			return false;
		int t = (a - '0') * 10 + (b - '0');
		
		return t <= 26 && t> 0;
	}
	
	public int getValue(char a, char b){
		int t = (a - '0') * 10 + (b - '0');
		
		return t;
	}

}

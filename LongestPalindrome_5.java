
//暴力法 超时
/*
public class LongestPalindrome_5 {

	public String longestPalindrome(String s) {
		if (s.length() == 0){
			return "";
		}
		int maxSize = 1;
		String result = "";
		for (int i = 0; i < s.length(); i++){
			for (int j = i+1; j < s.length()+1; j++){
				String str = s.substring(i, j);
				if (isHui(str) && str.length() >= maxSize){
					result = str;
					maxSize = result.length();
				}
			}
		}
		return result;
    }
	
	boolean isHui(String s){
		int i = 0, j = s.length()-1;
		while(i <= j ){
			if (s.charAt(i) == s.charAt(j)){
				i++;
				j--;
			}else{
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		Main5 m = new Main5();
		System.out.println(m.longestPalindrome(s));
			
	}

}*/

//分治法 超时？运行错误？
/*
public class LongestPalindrome_5 {
	public String longestPalindrome(String s) {
		if (s.length() <= 1){
			return s;
		}
		
		return solution(0, s.length(), s);
		
    }
	
	public String solution(int i, int j, String s){
		if (isHui(s)){
			return s;
		}
		return getLengther(solution(i-1,j,s), solution(i,j-1,s));
	}
	
	public String getLengther(String s1, String s2){
		if (s1.length() > s2.length())
			return s1;
		else
			return s2;
	}
	
	boolean isHui(String s){
		int i = 0, j = s.length()-1;
		while(i <= j ){
			if (s.charAt(i) == s.charAt(j)){
				i++;
				j--;
			}else{
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		Main5 m = new Main5();
		System.out.println(m.longestPalindrome(s));
			
	}

}*/
//动态规划法，可以通过  dp[ i ][ j ] = dp[ i + 1][ j - 1] && s[ i ] == s[ j]
public class LongestPalindrome_5 {

	public String longestPalindrome(String s) {
		if (s == null){
			return null;
		}
		if (s.length() <= 1){
			return s;
		}
		int maxSize = 1;
		String res = null;
		boolean[][] a = new boolean[s.length()][s.length()];
		
		//子串长度为1的全是回文
		for (int i = 0; i < s.length(); i++){
			a[i][i] = true;
            res = s.substring(i,i+1);
		}
		//处理长度为2的子串
		for(int i = 0; i < s.length()-1; i++){
			if (s.charAt(i) == s.charAt(i+1)){
				a[i][i+1] = true;
				res = s.substring(i,i+2);
				maxSize = res.length();
			}
		}
		
		//依次遍历长度从3到lenth-1的串
		for (int len = 3; len <= s.length(); len++){
			for (int i = 0; i <= s.length() - len; i++){
				int j = i + len - 1;
				if (s.charAt(i) == s.charAt(j)){
					a[i][j] = a[i+1][j-1];
					if (a[i][j] == true && len > maxSize)
					{
						res = s.substring(i, j+1);
						maxSize = res.length();
					}	
				}
			}
		}
		
		return res;
    }

}
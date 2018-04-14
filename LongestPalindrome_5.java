
//暴力法
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

}

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
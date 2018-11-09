package leetcode;

public class ValidPalindrome_680 {
	
	public boolean validPalindrome(String s) {
		
		if(s.length() <= 2)
			return true;
		
		int l = 0, r = s.length()-1;
		
		int flag = 0; //标志是否是第一次删除
		while(l <= r){
			
			if(s.charAt(l) != s.charAt(r)){
				
				System.out.println("l: "+l +" " + s.charAt(l)+ " r:" +r + " " + s.charAt(r));
				if(flag== 0 && s.charAt(l+1) == s.charAt(r)  && s.charAt(l) == s.charAt(r-1)){
					int res = 0;
					int i = l+1, j = r;
					while(i < j){
						if(s.charAt(i) != s.charAt(j)){
							res = 1;
							break;
						}	
						else{
							i++;
							j--;
						}
					}
					if(res == 0)
						return true;
					i = l; j = r-1;
					while(i < j){
						if(s.charAt(i) != s.charAt(j))
							return false;
						else{
							i++;
							j--;
						}
					}
					return true;
				}
				if(flag== 0 && s.charAt(l+1) == s.charAt(r)){
					flag = 1;
					l++;
				}else if(flag == 0 && s.charAt(l) == s.charAt(r-1)){
					flag = 1;
					r--;
				}else{
					return false;
				}	
			}else{
				l++;
				r--;
			}
			
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		ValidPalindrome_680 v = new ValidPalindrome_680();
		System.out.println(v.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
	}

}

package leetcode;

public class ReverseVowels_345 {
	public String reverseVowels(String s) {
		
		char[] vowels = {'a','A','e','E','i','I','o','O','u','U'};
		
		StringBuffer sb = new StringBuffer(s);
		int l = 0, r = s.length()-1;
		while(l < r){
			
			while(!isContains(s.charAt(l), vowels) && l < r){
				l++;
			}
			while(!isContains(s.charAt(r), vowels) && l < r){
				r--;
			}
			
			char temp = s.charAt(l);
			sb.setCharAt(l, s.charAt(r));
			sb.setCharAt(r, temp);
			
			l++;
			r--;
	
		}
		
		
		
		return sb.toString();
    }
	
	public boolean isContains(char ch, char[] vowels){
		
		for(int i = 0; i < vowels.length; i++){
			
			if(vowels[i] == ch){
				return true;
			}
			
		}
		return false;
		
		
	}
	
	
}

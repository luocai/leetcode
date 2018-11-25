package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome_409 {
	
	public int longestPalindrome(String s) {
        
		int res = 0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0;  i<s.length(); i++){
			
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else{
				map.put(s.charAt(i), 1);
			}
		}
		
		for(Integer count: map.values()){
			if(count % 2 == 0){
				res += count;
			}else{
				res += (count-1);
			}
		}
		
		if(s.length() > res)
			res++;
		
		return res;
    }

}

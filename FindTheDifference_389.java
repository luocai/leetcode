package leetcode;

import java.util.Arrays;

public class FindTheDifference_389 {
	
	public char findTheDifference(String s, String t) {
        
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		
		Arrays.sort(cs);
		Arrays.sort(ct);
		
		for(int i = 0; i < cs.length; i++){
			if(cs[i] != ct[i])
				return ct[i];
		}
		
		return ct[ct.length-1];  
    }

}

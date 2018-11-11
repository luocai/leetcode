package leetcode;

import java.util.Arrays;

public class FindContentChildren_455 {

	
//	public int findContentChildren(int[] g, int[] s) {
//		
//		Arrays.sort(s);
//		
//		int res = 0;
//		
//		for(int i = 0; i < g.length ;i++){
//			
//			for(int j = 0; j < s.length; j++){
//				
//				if(g[i] <= s[j]){
//					s[j] = -1;
//					res++;
//					break;
//				}
//				
//			}
//			
//		}
//		
//		return res;
//    }
	
	public int findContentChildren(int[] g, int[] s) {
		
		Arrays.sort(s);
		Arrays.sort(g);
		
		int i = 0, j = 0;
		while(i < g.length && j < s.length){
			
			if(g[i] <= s[j]){
			
				i++;
			}
			j++;
			
		}
		
		return i;
    }
}

package leetcode_12_30;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {
	
	public boolean wordPattern(String pattern, String str) {
		
		
		String[] ss = str.split(" ");
		
		if(pattern.length() != ss.length)
			return false;
        
		
		int[] res = new int[pattern.length()];
		Map<Character,Integer> map = new HashMap<>();
		Map<String,Integer> mm = new HashMap<>();
		res[0] = 0;
		map.put(pattern.charAt(0), 0);
		mm.put(ss[0], 0);
		
		for(int i = 1 ;i < pattern.length() ;i++){
			if(map.containsKey(pattern.charAt(i))){
				res[i] = map.get(pattern.charAt(i));
			}else{
				map.put(pattern.charAt(i), res[i-1]+1);
				res[i] = res[i-1] + 1;
			}
			if(mm.containsKey(ss[i])){
				int temp = mm.get(ss[i]);
				if(temp != res[i])
					return false;
			}else{
				mm.put(ss[i], res[i-1]+1);
				if(res[i] != res[i-1] + 1)
					return false;
			}
		}
		
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + " ");
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		
		WordPattern_290 w = new WordPattern_290();
		
		System.out.println(w.wordPattern("abba", "dog dog dog dog"));
	}

}

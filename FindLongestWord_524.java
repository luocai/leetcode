package leetcode;

import java.util.List;

public class FindLongestWord_524 {
	
	public String findLongestWord(String s, List<String> d) {
        
		String res = null;
		
		for(int i = 0; i < d.size() ;i++){
			
			if(judge(s, d.get(i))){
				
				if(res == null ||  (res.length() <= d.get(i).length()))
					res = d.get(i);
				
				if(res != null && res.length() == d.get(i).length() && isMin(res,d.get(i)))
					res = d.get(i);
				
			}
			
		}
		
		
		return res;
    }
	
	public boolean judge(String s, String t){
		
		int i = 0, j = 0;
		
		while(i < s.length() && j < t.length()){
			
			if(s.charAt(i) == t.charAt(j)){
				i++;
				j++;
			}else{
				i++;
			}
		}
		
		if(j == t.length()){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean isMin(String s, String t){
		
		for(int i = 0; i < s.length(); i++){
			
			if(t.charAt(i) > s.charAt(i)){
				return false;
			}else if(t.charAt(i) < s.charAt(i)){
				return true;
			}
			
		}
		return false;
		
	}

}

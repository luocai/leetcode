package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels_763 {
	
	public List<Integer> partitionLabels(String S) {
		
		if(S.length() == 0)
			return null;
		char[] ss = S.toCharArray();
		List<Integer> res = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < ss.length; i++){
			map.put(ss[i], i);
		}

		
		int start = 0;
	
		while(start < ss.length){
			
			int end = map.get(ss[start]);
			
			for(int x = start; x < end; x++){
				
				end = Math.max(end, map.get(ss[x]));
				
			}
			
			res.add(new Integer(end-start+1));
			start = end+1;;
			
		}
		
		for(int i = 0 ; i < res.size() ;i++){
			System.out.println(res.get(i));
		}
		
		return res;
    }
	
	public static void main(String[] args) {
		
		PartitionLabels_763 m = new PartitionLabels_763();
		m.partitionLabels("ababcbacadefegdehijhklij");
		
	}

}

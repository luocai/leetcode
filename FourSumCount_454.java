package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount_454 {
	
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int n = A.length;
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				int temp = A[i] + B[j];
				if(map.containsKey(temp)){
					map.put(temp, (int)map.get(temp)+1);
				}else{
					map.put(temp, 1);
				}
			}
		}
		
		int res = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				
				int temp = C[i] + D[j];
				if(map.containsKey((-1)*temp)){
					res += map.get((-1)*temp);
				}
				
			}
		}
		
		
		return res;
    }
}

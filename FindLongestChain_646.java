package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestChain_646 {
	
	public int findLongestChain(int[][] pairs) {
		
		Arrays.sort(pairs,new MyCompartor());
		
		for(int i = 0 ; i<pairs.length; i++){
			
			System.out.println(pairs[i][0] + " " + pairs[i][1]);
			
		}
		int[] dp = new int[pairs.length];
		int max = 0;
		
		for(int i = 0;  i< pairs.length ; i++){
			dp[i] = 1;
			for(int j  = 0; j < i; j++){
				
				if(pairs[i][0] > pairs[j][1]){
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
				
			}
			max = Math.max(max, dp[i]);
			
		}
        
		return max;
    }
	
	class MyCompartor implements Comparator<int[]>{

		@Override
		public int compare(int[] o1, int[] o2) {
			
			return o1[0] - o2[0];
		}
		
	}
	
	public static void main(String[] args) {
		
		int[][] a = {{3,4},{2,3},{1,2}};
			
		FindLongestChain_646 f = new FindLongestChain_646();
		System.out.println(f.findLongestChain(a));
	}

}

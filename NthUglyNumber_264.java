package leetcode;

import java.util.Arrays;

public class NthUglyNumber_264 {

//	public int nthUglyNumber(int n) {
//        
//		int[] zs = {2, 3, 5};
//		
//		boolean[] dp = new boolean[1100000000];
//		for(int i = 1; i <= 5; i++){
//			dp[i] = true;
//		}
//		
//		int res = 5;
//		
//		for(int i = 6; i < 1100000000; i++){
//			
//			for(int j = 0; j < 3; j++){
//				if(i % zs[j] == 0){
//					dp[i] = dp[i / zs[j]];
//					if(dp[i] == true){
//						res++;
//						break;
//					}
//				}
//			}
//			
//			if(res == n)
//				return i;
//		}
//		
//		return 0;
//		
//    }
	
//	public int nthUglyNumber(int n) {
//        int[] ugly = new int[n];
//        ugly[0] = 1;
//        int index2 = 0, index3 = 0, index5 = 0;
//        int factor2 = 2, factor3 = 3, factor5 = 5;
//        for (int i = 1; i < n; i++) {
//            int min = Math.min(factor2, Math.min(factor3, factor5));
//            ugly[i] = min;
//            if (min == factor2) {
//                factor2 = 2 * ugly[++index2];
//            }
//            if (min == factor3) {
//                factor3 = 3 * ugly[++index3];
//            }
//            if (min == factor5) {
//                factor5 = 5 * ugly[++index5];
//            }
//        }
//        System.out.println(Arrays.toString(ugly));
//        return ugly[n-1];
//    }

	public int nthUglyNumber(int n){
		
		int[] ugly = new int[n];
		
		// index1,2,3
		int[] ids = new int[3];
		
		ugly[0] = 1;
		
		for(int i = 1; i < n; i++){
			
			int a = ugly[ids[0]] * 2;
			int b = ugly[ids[1]] * 3;
			int c = ugly[ids[2]] * 5;
			
			int min = Math.min(a, Math.min(b, c));
			
			if(a == min)
				ids[0]++;
			if(b == min)
				ids[1]++;
			if(c == min)
				ids[2]++;
			
			ugly[i] = min;
			
		}
		
		return ugly[n-1];
	}
	public static void main(String[] args) {
		NthUglyNumber_264 n = new NthUglyNumber_264();
		
		System.out.println(n.nthUglyNumber(1600));
	}
	
	
}

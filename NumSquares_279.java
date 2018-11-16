package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumSquares_279 {
	//DFS 会超时
//	public int numSquares(int n) {
//        
//		return solution(n, n);
//    }
//	
//	public int solution(int n,int x){
//		
//		if(x == 0){
//			if(n != 0)
//				return Integer.MAX_VALUE;
//			else
//				return 0;
//		}
//		
//		if(isSqare(x)){
//			return Math.min(solution(n-x,n-x) + 1,solution(n,--x));
//		}else{
//			return solution(n,--x);
//		}
//		
//	}
//	
//	public boolean isSqare(int x){
//		
//		int r = (int) Math.sqrt(x);
//		
//		if( r*r == x)
//			return true;
//		else
//			return false;
//		
//	}
	
//	public int numSquares(int n) {
//		
//		
//        
//		return solution(n, n);
//    }
	
	//DFS2 会超时
//	public int solution(int n,int x){
//		
//		if(x == 0){
//			if(n != 0)
//				return Integer.MAX_VALUE;
//			else
//				return 0;
//		}
//		
//		if(isSqare(x)){
//			return Math.min(solution(n-x,n-x) + 1,solution(n,getNextSqrt(x)));
//		}else{
//			return solution(n,getNextSqrt(x));
//		}
//		
//	}
//	
//	public int getNextSqrt(int x){	
//		x--;
//		while(x >= 1){
//			
//			if(isSqare(x)){
//				return x;
//			}	
//			else
//				x--;	
//		}
//		return 0;	
//	}
	
	
	public int numSquares(int n) {
       
		int[] nums = new int[n+1];
		for(int i = 0; i <= n; i++)
			nums[i] = i;
		
		for(int i = 2; i <= n; i++){
			for(int j = 1; j*j <= i; j++){
				
				nums[i] = Math.min(nums[i],nums[i-j*j] + 1);
			}
		}
		
		return nums[n];
    }


	
	public static void main(String[] args) {
		NumSquares_279 m = new NumSquares_279();
		Long s = System.currentTimeMillis();
		System.out.println(m.numSquares(48));
		Long e = System.currentTimeMillis();
		System.out.println("程序执行了：" + (e-s));
	}

}

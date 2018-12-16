package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class FindTargetSumWays_494 {
	
	//dp
//	public int findTargetSumWays(int[] nums, int S) {
//        
//		int[][] dp = new int[nums.length][S];
//		
//		dp[0][]
//		return 0;
//    }


//	public int findTargetSumWays(int[] nums, int S) {
//        
//		return solution(nums,S,0,0);
//    }
//
//	public int solution(int[] nums,int s, int index, int nowSum){
//		
//		if(index == nums.length){
//			if(nowSum == s){
//				return 1;
//			}else{
//				return 0;
//			}
//		}
//		
//		return solution(nums,s,index+1,nowSum + nums[index]) + solution(nums, s,index+1, nowSum-nums[index]);
//		
//	}
	
	//超时
	public int findTargetSumWays(int[] nums, int S) {
        
		Queue<Integer> queue = new LinkedList<>();
		queue.add(S);
		
		for(int i = nums.length-1; i >= 0; i--){
			int size = queue.size();
			while(size != 0){
				int t = queue.poll();
				queue.add(t+nums[i]);
				queue.add(t-nums[i]);
				size--;
			}
		}
		
		int res = 0;
		for(Integer m :queue){
			if(m == 0){
				res++;
			}
		}
		
		return res;
    }
	
	public static void main(String[] args) {
		
		
		int[] nums = {1,1,1,1,1};
		FindTargetSumWays_494 f = new FindTargetSumWays_494();
		
		System.out.println(f.findTargetSumWays(nums, 3));
	}
}

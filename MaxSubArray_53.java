package leetcode;

public class MaxSubArray_53 {
	
	//如果从 前x个数的和为负数，那么后面的绝对不可能包括这前面的x个数，不然和必然减少
public int maxSubArray(int[] nums) {
		
		int res = Integer.MIN_VALUE;
		
		int ans = 0;

		for(int i = 0; i < nums.length ; i++){
			
			if(ans < 0){
				ans = 0;
			}
			ans += nums[i];
			res = Math.max(res, ans);
		}
		
		return res;
    }

}

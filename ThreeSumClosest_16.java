package leetcode;

import java.util.Arrays;

public class ThreeSumClosest_16 {
	
	public int threeSumClosest(int[] nums, int target) {
		
		int abs_res = Integer.MAX_VALUE;
		int res = Integer.MAX_VALUE;
		
		Arrays.sort(nums);
		
		for(int i = 0 ; i < nums.length-2; i ++){
			
			int l = i+1, r = nums.length-1;
			
			while(l < r){
				
				int sum = nums[i] + nums[l] + nums[r];
				int temp = Math.abs(nums[i] + nums[l] + nums[r] - target);
				
				if(temp < abs_res){
					res = sum;
					abs_res = temp;
				}
					
				
				if(sum > target)
					r--;
				else if(sum < target)
					 l++;
				else
					return sum;		
			}
			
		}
		
        return res;
    }
	
	public static void main(String[] args) {
		
		int[] a = {-1,2,1,-4};
		
		ThreeSumClosest_16 t = new ThreeSumClosest_16();
		System.out.println(t.threeSumClosest(a, 1));
	}
	

}

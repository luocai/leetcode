package leetcode;

import java.util.Arrays;

public class NextPermutation_31 {

	
	public void nextPermutation(int[] nums) {
		int tarIndex = -1;
		for(int i = nums.length-2; i >= 0; i--){
			int tar = nums[i];
			
			for (int j = i+1; j < nums.length; j++){
				
				if(nums[i] < nums[j]){
					if (nums[j] <= tar || tar == nums[i]){
						tar = nums[j];
						tarIndex = j;
						//System.out.println(tar);
					}
				}
			}
			if(tarIndex != -1){
				int temp = nums[i];
				nums[i] = nums[tarIndex];
				nums[tarIndex] = temp;
				
				Arrays.sort(nums, i+1, nums.length);
//				for(int k = 0; k < nums.length;k++){
//					System.out.print(nums[k] + " ");	
//				}
				break;
			}
		}
		if (tarIndex == -1){
			Arrays.sort(nums);
		}
    }
	public static void main(String[] args) {
		
		int[] nums = {3,2,1};
		
		NextPermutation_31 n = new NextPermutation_31();
		n.nextPermutation(nums);

	}

}

package leetcode;

public class RemoveDuplicates_26 {
	
	
	public int removeDuplicates(int[] nums) {
		int k = 0;
		for(int i = 1; i < nums.length; ){
			if(nums[k] == nums[i]){
				
				i++;
			}else{
				k++;
				nums[k] = nums[i];
				i++;
			}
		}
		
//		for(int j = 0; j <= k; j++)
//		{
//			System.out.println(nums[j]);
//		}
		return k+1;
    }


	public static void main(String[] args) {
		
		int[] nums = {1,1,2};
		
		RemoveDuplicates_26 r = new  RemoveDuplicates_26();
		
		System.out.println(r.removeDuplicates(nums));
		
	}

}

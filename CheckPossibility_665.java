package leetcode;

public class CheckPossibility_665 {
	
//	O(N2)
//	public boolean checkPossibility(int[] nums) {
//        
//		if(nums.length == 1)
//			return true;
//		if(nums.length == 2)
//			return true;
//		
//		for(int i = 0; i < nums.length ; i++){
//			
//			int temp = nums[i];
//			if(i==0){
//				nums[i] = nums[i+1];
//			}else{
//				nums[i] = nums[i-1];
//			}
//
//			if(isDesc(nums) == true){
//				
//				return true;
//			}else{
//				nums[i] = temp;
//			}
//			
//		}
//		
//		return false;
//    }
//	
//	//是否非递减
//	public boolean isDesc(int[] nums){
//		
//		if(nums.length == 1)
//			return false;
//		for(int i = 1 ; i < nums.length; i ++){
//			
//			if(nums[i] < nums[i-1])
//				return false;
//			
//		}
//		
//		return true;
//	}
	
	public boolean checkPossibility(int[] nums) {
	    int cnt = 0;
	    for (int i = 1; i < nums.length && cnt < 2; i++) {
	        if (nums[i] >= nums[i - 1]) {
	            continue;
	        }
	        cnt++;
	        if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
	            nums[i] = nums[i - 1];
	        } else {
	            nums[i - 1] = nums[i];
	        }
	    }
	    return cnt <= 1;
	}
}

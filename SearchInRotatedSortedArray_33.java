package leetcode;

public class SearchInRotatedSortedArray_33 {

	
	public int search(int[] nums, int target) {
        
		if(nums.length == 0)
			return -1;
		
		int i = 0;
		int j = nums.length-1;
		while(i <= j){
			
			int mid = (i+j+1)/2;
			if(nums[mid] == target){
				return mid;
			}
			
			if(nums[mid] > nums[i]){
				
				if(target < nums[mid] && target >= nums[i]){
					j = mid - 1;
				}else{
					i = mid + 1;
				}
			}else{
				
				if(target > nums[mid] && target <= nums[j]){
					i = mid + 1;
				}else{
					j = mid - 1;
				}
				
			}
		}
		return -1;
        
    }

	public static void main(String[] args) {
		
		int[] nums = {3};
		
		SearchInRotatedSortedArray_33 s = new SearchInRotatedSortedArray_33();
		int res = s.search(nums, 3);
		
		System.out.println(res);
	}

}

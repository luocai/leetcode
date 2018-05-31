package leetcode;

public class SearchInsert_35 {

	public int searchInsert(int[] nums, int target) {
        
		for(int i = 0; i < nums.length;i++ ){
			
			if(target < nums[i]){
				
				return i;
			}else if(target == nums[i]){
				return i;
			}
		}
		for(int j = 0; j < nums.length; j++){
			System.out.println(nums[j]);
		}
		
		if(target > nums[nums.length-1])
			return nums.length;
		else return 0;
    }

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		SearchInsert_35 s = new SearchInsert_35();
		int res = s.searchInsert(nums, 7);
		System.out.println("结果是:" + res);
	}

}

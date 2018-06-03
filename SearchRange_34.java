package leetcode;

public class SearchRange_34 {

	
	public int[] searchRange(int[] nums, int target) {
		
		int i = 0;
		int j = nums.length - 1;
		int index = -1;
		
		while(i <= j){
			int mid = (i+j) / 2;
			
			if (nums[mid] == target){
				index = mid;
				break;
			}
			
			if (nums[mid] > target){
				j = mid - 1;
			}else if(nums[mid] < target){
				i = mid + 1;
			}
		}
		
		if (index == -1){
			return new int[]{-1,-1};
		}else{
			int end = index;
			int sta = index;
			while(end <= nums.length-2 && nums[end+1] == target){
				end++;
			}
			while(sta >= 1 && nums[sta-1] == target){
				sta--;
			}
			return new int[]{sta, end};
		}
	}
	
	//O(N)
//	public int[] searchRange(int[] nums, int target){
//		
//		//int flag = 0;
//		for(int i = 0; i < nums.length; i++){
//			if(nums[i] == target){
//			//	flag = 1;
//				int j = i;
//				while(j <= nums.length-2 && nums[j+1] == target){
//					j++;
//				}
//				return new int[]{i, j};
//			}
//		}
//		return new int[] {-1,-1};
//		
//	}
	 
	public static void main(String[] args) {
		
		int nums[] = {1,1,1,2,2,3,4,5,5,6,7,7,8,8};
		SearchRange_34 s = new SearchRange_34();
		int[] res = s.searchRange(nums, 8);
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i]);
		}
	}

}

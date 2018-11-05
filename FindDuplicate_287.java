package leetcode;

public class FindDuplicate_287 {
//	public int findDuplicate(int[] nums) {
//		
//		int l = 0, r = nums.length -1;
//		
//		int mid = 0;
//		
//		while(l <= r){
//			mid = (l + r) /2;
//			int count = 0;
//			
//			for(int j = 0; j < mid; j++){
//				
//				if(nums[j] <= mid){
//					count++;
//				}
//				
//			}
//			
//			if(count > nums[mid]){
//				r = mid;
//			}else{
//				l = mid +1;
//			}
//			
//		}
//		
//		return l;
//    }
	
	public int findDuplicate(int[] nums) {
        int high=nums.length-1;
        int low=0;
     
        while(high>low){
        	int mid=(high+low)/2;
        	int count=0;
        	for(int i=0;i<nums.length;i++){
        		if(nums[i]<=mid)
        			count++;
        	}
        	if(count>mid)
        		high=mid;
        	else
        		low=mid+1;
        }
        return low;
    }


}

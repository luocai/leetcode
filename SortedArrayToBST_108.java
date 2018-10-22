package leetcode;

public class SortedArrayToBST_108 {
	
	public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return null;
        }
        
        return sortedArrayToBSTcore(nums,0, nums.length-1);
        
        
    }
    private TreeNode sortedArrayToBSTcore(int[] nums, int start, int end){
        
        if(start < end){
            
            int mid = (start + end) /2;
            TreeNode node =new TreeNode(nums[mid]);
            
            node.left = sortedArrayToBSTcore(nums,start, mid -1);
            node.right = sortedArrayToBSTcore(nums,mid+1, end);
            
            return node;
            
        }
       else{
           return null;
       }
        
    }

}

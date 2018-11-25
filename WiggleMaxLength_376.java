package leetcode;

public class WiggleMaxLength_376 {

	
	public int wiggleMaxLength(int[] nums) {
		
		int up = 1;
		int down = 1;
		
		for(int i = 1; i < nums.length; i++){
			if(nums[i] > nums[i-1]){
				up = down+1;
			}else if(nums[i] < nums[i-1]){
				down = up+1;
			}
			System.out.println("up:"+up+" down:"+down);
		}
		return Math.max(up, down);
    } // 2 5 3 8 6 2 1
	
	
	
	public static void main(String[] args) {
		
		int[] a = {2 ,5 ,3, 8,6 ,2 ,1};
		WiggleMaxLength_376 w = new WiggleMaxLength_376();
		w.wiggleMaxLength(a);
		
	}
}

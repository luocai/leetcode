package leetcode;

public class RemoveDuplicates_80 {
	
	public int removeDuplicates(int[] nums) {
        
		int i = 1;
		int count = 1;
		
		int position = 1;
		
		while( i < nums.length){
			
			if(nums[i] == nums[i-1]){
				count++;
				if(count <= 2){
					nums[position++] = nums[i];
				}
				i++;
			}else{
				nums[position++] = nums[i++];
				count = 1;
			}
			
		}
		
		for(int k = 0; k < position ;k++)
		{
			System.out.print(nums[k]+" ");
		}
		return position;
    }
	
	public static void main(String[] args) {
		
		int[] a = {1,1,1,2,2,3};
		RemoveDuplicates_80 m = new RemoveDuplicates_80();
		
		m.removeDuplicates(a);
	}

}

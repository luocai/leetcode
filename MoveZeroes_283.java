package leetcode;

public class MoveZeroes_283 {
	
	public void moveZeroes(int[] nums) {
		
		
		int zcount = 0;
        
		for(int i = 0; i < nums.length ;){
			
			if(nums[i] == 0){
				zcount++;
				i++;
			}else{
				
				if(zcount != 0){
					nums[i-zcount] = nums[i];
					nums[i] = 0;
					i = i - zcount + 1;
					
					zcount = 0;
					
				}else{
					i++;
				}
				
			}
		}
		
    }
	
	public static void main(String[] args) {
		
		int[] a = {2,4,0,3,0,0,3,2};
		
		MoveZeroes_283 m = new MoveZeroes_283();
		m.moveZeroes(a);
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] +" ");
		}
	}

}

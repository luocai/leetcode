package leetcode;

public class SortColors_75 {
	
	public void sortColors(int[] nums) {
        
		int[] a = new int[3];
		
		for(int i = 0; i < nums.length ; i++){
			if(nums[i] == 0)
				a[0]++;
			else if(nums[i] == 1)
				a[1]++;
			else
				a[2]++;
		}
		
        System.out.println(a[0] + " "+ a[1] + " " +a[2]);
		int j = 0;
		for(int i = 0; i < 3; i++){
            int t = 0;
			while(t < a[i]){
				nums[j] = i;
				j++;
                t++;
			}
		}
		
    }
	
//	public void sortColors(int[] nums) {
//        
//		int i = 0, j = nums.length - 1;
//		
//		for(int t = 0 ; t <= j; t++){
//			
//			if(nums[t] == 0){
//				swap(i,t,nums);
//				i++;
//			}else if(nums[t] == 2){
//				swap(j,t,nums);
//				j--;
//			}
//			
//		}
//		
//    }
//	
	private void swap(int a, int b, int[] nums){
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,0,1};
		
		SortColors_75 s = new SortColors_75();
		s.sortColors(a);
	}
	

}

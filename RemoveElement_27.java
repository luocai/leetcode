package leetcode;

public class RemoveElement_27 {

	public int removeElement(int[] nums, int val) {
	    //int count = 0;
		if(nums.length == 0)
			return 0;
		int flag = 0; //±êÖ¾Á¿
	    int j = nums.length - 1;
	    for(int i = 0; i <= j; i++){
	    	if(nums[i] == val){
	    		flag = 1;
	    		for(; j > i; j--){
	    			if(nums[j] != val){
	    				int temp = nums[i];
	    				nums[i] = nums[j];
	    				nums[j] = temp;
	    			//	count++;
	    				break;
	    			}
	    		}
	    	}
	    }
	    
//	    for(int i = 0; i < nums.length; i++){
//	    	System.out.println(nums[i]);
//	    }
	    if (flag == 1)
	    	return j;
	    else
	    	return j+1;
	}
	 
	public static void main(String[] args) {
		
		int[] arr = {2,2,2,4};
		RemoveElement_27 r = new RemoveElement_27();
		System.out.println( r.removeElement(arr, 5));

	}

}

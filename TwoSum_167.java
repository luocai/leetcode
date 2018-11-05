package leetcode;

public class TwoSum_167 {
	
	//另外，可以使用双指针法
	 public int[] twoSum(int[] numbers, int target) {
	        
	        int[] res = new int[2];
	        
	        for(int i = 0; i < numbers.length; i++){
	            
	    
            	int l = i+1, r = numbers.length-1;
            	int mid = 0;
            	while( l <= r){
            		mid = (l+r) / 2;
            		if(numbers[i] + numbers[mid] < target){
            			l = mid +1;
            		}else if(numbers[i] + numbers[mid] == target){
            			res[0] = i+1;
            			res[1] = mid+1;
            			return res;
            		}else{
            			r = mid -1;
            		}
            		
            	}
            	
	        }
	        
	        return res;
	        
	 }
	 
	 public static void main(String[] args) {
		
		 int[] a = {5,25,75};
		 
		 TwoSum_167 t = new TwoSum_167();
		 System.out.println(t.twoSum(a, 100));
	}

}

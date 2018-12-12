package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetRow_119 {

	public List<Integer> getRow(int rowIndex) {
     
		rowIndex++;
		List<Integer> res = new ArrayList<Integer>();
		
		int[] nums = new int[rowIndex];
		int[] helper = new int[rowIndex];
		
		
		
		if(rowIndex <= 0){
			return res;
		}else if(rowIndex == 1){
			res.add(1);
			return res;
		}else if(rowIndex == 2){
			res.add(1);
			res.add(1);
			return res;
		}
		nums[0] = 1;
		nums[1] = 1;
		
		for(int i = 2; i < rowIndex; i++){
			
			for(int j = 0; j < i-1;j++){
				helper[j] = nums[j]+ nums[j+1];
			}
			
			nums[0] = 1;
			for(int k = 1; k < i; k++){
				nums[k] = helper[k-1];
			}
			nums[i] = 1;
		}
		
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " ");
			res.add(nums[i]);
		}
		
		return res;
    }
	
	public static void main(String[] args) {
		GetRow_119 g = new GetRow_119();
		g.getRow(0);
	}

}

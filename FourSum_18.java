package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum_18 {
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
        
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums.length < 4)
			return res;
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length ;i++){
			if(i > 0 && nums[i] == nums[i-1]){
				continue;
			}
			for(int j = i+1; j < nums.length ;j++){
				
				if(j != i+1 && nums[j] == nums[j-1])
					continue;
				
				int b = j + 1, e = nums.length -1;
				
				while(b <e){
					
					if(b != j+1 && nums[b] == nums[b-1]){
						b++;
						continue;
					}
					if(nums[i] + nums[j] + nums[b] + nums[e] < target){
						b++;
					}else if(nums[i] + nums[j] + nums[b] + nums[e] > target){
						e--;
					}else{
						List<Integer> tr = new ArrayList<>();
		    			  tr.add(nums[i]);
		    			  tr.add(nums[j]);
		    			  tr.add(nums[b]);
		    			  tr.add(nums[e]);
		    			  res.add(tr);
		    			  b++;
					}
				}
			}
		}
		
		return res;
    }
	
	/** 递归解法，超时
	 * @param sums 
	 * @param target
	 * @param nowSum
	 * @param count 
	 * @param index
	 * @param res
	 * @param tempRes
	 */
//	public void solution(int[] sums, int target, int nowSum,int count, int index, List<List<Integer>> res, List<Integer> tempRes){
//		
//		if(count == 4){
//			if(target == nowSum){
//				Collections.sort(tempRes);
//				if(!res.contains(tempRes))
//					res.add(tempRes);
//			}
//			return;
//		}
//		
//		if(index == sums.length){
//			return;
//		}
//		
//		
//		solution(sums,target,nowSum,count,index + 1,res,new ArrayList(tempRes));
//		tempRes.add(sums[index]);
//		solution(sums,target,nowSum + sums[index],count+1,index + 1,res,new ArrayList(tempRes));
//		
//	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 0, -1, 0, -2, 2};
		FourSum_18 f = new FourSum_18();
		
		List<List<Integer>> res = f.fourSum(a, 0);
		System.out.println(res.size());
	}

}

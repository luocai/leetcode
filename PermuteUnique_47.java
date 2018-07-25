package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermuteUnique_47 {

	public static void main(String[] args) {
		
		PermuteUnique_47 p = new PermuteUnique_47();
		
		int[] a = {1,1,2};
		
		List<List<Integer>> list = p.permuteUnique(a);
		
		for(List l : list){
			System.out.println(l);
		}
	}
	
	
	public List<List<Integer>> permuteUnique(int[] nums) {
        
		List<List<Integer>> result = new ArrayList();
		
		
		solve(nums, result,  0);
		
		return result;
    }
	
	public void solve(int[] nums,List<List<Integer>> result,int index){
		
		if(index == nums.length){
			
			result.add(toList(nums));
			//res.remove(nums.length-1);
			return;
		}
		
		Set<Integer> appear = new HashSet<>();
		for(int i = index ; i < nums.length; i++){
			
			if(appear.contains(nums[i]))
				continue;
			
			appear.add(nums[i]);
			swap(nums, i , index);	
			solve(nums,result,index +1);
			swap(nums,i, index);
			
//			if(nums[index] != nums[i]){
//				
//				swap(nums, i , index);	
//				r.add(nums[index]);
//				solve(nums,result, r,index +1);
//				swap(nums,i, index);
//			}else{
//				r.add(nums[index]);
//				solve(nums,result, r,index +1);
//			}
			
			
			
		}
		
	}
	
	public void swap( int[] nums,int s, int index){
		
		int temp = nums[s];
		nums[s] =nums[index];
		nums[index] = temp;
	}
	
	public List<Integer> toList(int nums[]){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            list.add(nums[i]);
        return list;
    }

}

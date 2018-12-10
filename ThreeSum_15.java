package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum_15 {

	//哈希表 on2
//	public List<List<Integer>> threeSum(int[] nums) {
//       List<List<Integer>> res = new ArrayList<List<Integer>>();
//       
//       if(nums.length < 3)
//    	   return res;
//       
//       Map<Integer, Integer> map = new HashMap<>();
//       
//       for(int i = 0; i<nums.length ;i++){
//    	   if(map.containsKey(nums[i])){
//    		   map.put(nums[i],map.get(nums[i])+1);
//    	   }else{
//    		   map.put(nums[i], 1);
//    	   }
//       }
//       
//       for(int i = 0; i < nums.length; i++){
//    	   
//    	   for(int j = i+1; j < nums.length ;j++){
//    		   
//    		   int left = (nums[i] + nums[j]) * (-1);
//    		   
//    		   if(map.containsKey(left)){
//    			   
//    			   if(left == nums[i] && left == nums[j]){
//    				   if(map.get(left) < 3 ){
//    					   continue;
//    				   }
//    			   }
//    			   if(left == nums[i] || left == nums[j]){
//    				   if(map.get(left) < 2 ){
//    					   continue;
//    				   }
//    			   }
//    			   
////    			   System.out.println("i:" + i + " j:" + j + " left:" + left);
//    			   List<Integer> tres = new ArrayList<>();
//    			   tres.add(nums[i]);
//    			   tres.add(nums[j]);
//    			   tres.add(left);
//    			   
//    			   Collections.sort(tres);
//    			   if(!res.contains(tres))
//    				   res.add(tres);
//    		   }
//    		   
//    	   }
//    	   
//       }
//       
//       
//       return res;
//    }
	
	
	//双指针
	// 注意：去重的时候，不能用 sort函数，会超时
	public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      
      if(nums.length < 3){
    	  return res;
      }
      Arrays.sort(nums);
    
      for(int i = 0; i < nums.length; i++){
    	  if(i > 0 && nums[i] == nums[i-1])
    		  continue;
    	  int b = i+1, e = nums.length-1;
    	  while(b < e){
    		  
    		  if(b != i+1 && nums[b] == nums[b-1]){
    			  b++;
    			  continue;
    		  }
    		  
    		  if(nums[i] + nums[b] + nums[e] < 0){
    			  b++;
    		  }else if(nums[i] + nums[b] + nums[e] > 0){
    			  e--;
    		  }else{
    			  
    			  
    			  List<Integer> tr = new ArrayList<>();
    			  tr.add(nums[i]);
    			  tr.add(nums[b]);
    			  tr.add(nums[e]);
    			  res.add(tr);
    			  b++;
    		  }
    		  
    	  }
    	  
      }
      
//      
      
      return res;
   }
	
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
//		int[] nums = {0,0};
		ThreeSum_15 t = new ThreeSum_15();
		
		List<List<Integer>> res = t.threeSum(nums);
//		
		System.out.println(res.size());
//		
		for(int i = 0; i < res.size() ;i++){
			for(int j = 0; j < res.get(i).size() ;j++){
				System.out.print(res.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}

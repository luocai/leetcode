package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber_136 {
	
	//异或：相同为0，不同为1. 异或同一个数两次，原数不变。
	public int singleNumber(int[] nums) {
        int res = 0;
        
        for(int i = 0; i < nums.length; i++){
        	res ^= nums[i];
        }
        
        return res;
    }
	
//	public int singleNumber(int[] nums) {
//		
//		Map<Integer,Integer> map = new HashMap<>();
//		int res = -1;
//		List<Integer> l = new ArrayList<>();
//        
//        for(int i = 0; i < nums.length; i++){
//        	if(map.containsKey(nums[i])){
//        		map.put(nums[i], 2);
//        		l.remove((Integer)nums[i]);
//        	}else{
//        		map.put(nums[i], 1);
//        		l.add(nums[i]);
//        	}
//        }
//        
//        return l.get(0);
//    }

}

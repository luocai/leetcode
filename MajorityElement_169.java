package leetcode_12_19;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {

	public int majorityElement(int[] nums) {
        
		new SimpleDateFormat();
        Map<Integer,Integer> map = new HashMap();
        
        int res = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i]) > map.get(nums[res])){
                    res = i;
                }
            }else{
                map.put(nums[i],1);
            }
        }
        
        return nums[res];
    }
	
	//摩尔计数法
	public int majorityElement1(int[] nums) {
        
        int count = 1;
        int res = nums[0];
        
        for(int i = 1; i < nums.length ;i++){
        	
        	
        	if(nums[i] == res)
        		count++;
        	else{
        		count--;
                if(count == 0){
                    res = nums[i+1];
                   
                }
        	}
        }
        
        return res;
    }

}

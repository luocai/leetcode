package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_137 {

	public int singleNumber(int[] nums) {
        
		Map<Integer, Integer> map = new HashMap();
		for(int i = 0; i < nums.length;i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i], 2);
			}else{
				map.put(nums[i], 1);
			}
		}
		for(Integer key: map.keySet()){
			if(map.get(key) == 1)
				return key;
		}
		
		return 0;
    }
}

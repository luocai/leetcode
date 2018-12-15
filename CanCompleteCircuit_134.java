package leetcode;

public class CanCompleteCircuit_134 {
	
	public int canCompleteCircuit(int[] gas, int[] cost) {
        
		for(int i = 0; i<gas.length ;i++){
			
			if(gas[i] < cost[i]){
				continue;
			}
			
			int tgas = 0;
			int j = i;
			boolean flag = true;
			
			while(j != i || flag){
				flag = false;
				tgas = tgas + gas[j] - cost[j];
				if(tgas < 0){
					break;
				}else{
					
					if(j == gas.length-1)
						j = 0;
					else
						j++;
				}
			}
			
			if(j == i && flag == false && tgas >= 0){
				return j;
			}
		}
		
		return -1;
    }

}

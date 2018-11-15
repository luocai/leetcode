package leetcode;

public class MaxProfit_121 {
	
	public int maxProfit(int[] prices) {
        
		if(prices.length == 0)
			return 0;
		
        int min = prices[0];
        int res = 0;
        for(int i = 0; i < prices.length; i++){
            
            if(prices[i] < min)
            	min = prices[i];
            
            if((prices[i] - min) > res)
            	res = prices[i] - min;
            
        }
        return res;
    }

}

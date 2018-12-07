package leetcode;

public class MaxProfit_309 {
	
public int maxProfit(int[] prices) {
        
		if(prices.length < 2)
			return 0;
		
		int s0 = 0; // rest (sell 后， rest 后)
		int s1 = -prices[0]; // buy 后
		int s2 = Integer.MIN_VALUE; // sell 
		
		for(int i = 1; i< prices.length; i++){
			
			int pre0 = s0;
			int pre1 = s1;
			int pre2 = s2;
			
			s0 = Math.max(pre0, pre2);
			s1 = Math.max(pre0 - prices[i], pre1);
			s2 = pre1 + prices[i];
			
		}
		return Math.max(s0, s2);
    }
	
	public static void main(String[] args) {
		
		int[] prices = {1,2,3,0,2};
		MaxProfit_309  m = new MaxProfit_309();
		
		System.out.println(m.maxProfit(prices));
	}

}

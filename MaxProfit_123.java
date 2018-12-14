package leetcode;

public class MaxProfit_123 {
	
	public int maxProfit(int[] prices) {
        
		if(prices == null || prices.length == 0){
			return 0;
		}
		int maxp = 0;
		for(int i = 0; i < prices.length ;i++){
			
			maxp = Math.max(maxp,solution(prices,0,i)+solution(prices,i, prices.length));
			System.out.println("。。。");
		}
		
		return maxp;
    }

	public int solution(int[] prices, int i, int j){
		
		int pre = prices[i];
		int profit = 0;
		for(int x = i+1; x< j;x++){
			
			if(prices[x] < pre ){
				pre = prices[x];
			}
			
			if(prices[x] - pre > profit){
				profit = prices[x] - pre;
			}
			
		}
		System.out.println("i:" + i + " j:" + j + " max: " + profit) ;
		return profit;
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		MaxProfit_123 m = new MaxProfit_123();
		
		System.out.println(m.maxProfit(a));
	}
}

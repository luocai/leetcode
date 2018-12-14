package leetcode;

public class MaxProfit_122 {
	
	public int maxProfit(int[] prices) {
        
		if(prices == null || prices.length == 0){
			return 0;
		}
			
		int pre = prices[0];
		int proft = 0;
		
		for(int i = 1; i < prices.length;i++){
			
			if(prices[i] <= pre){
				pre = prices[i];
			}else{
				while(i<prices.length-1 && prices[i] < prices[i+1] ){
					i++;
				}
				
				proft = proft + (prices[i] - pre);
				if(i < prices.length-1){
					pre = prices[i+1];
				}
				
			}
			
		}
		
		return proft;
    }

 //dfs 超时
//	public int maxProfit(int[] prices) {
//        
//		if(prices == null || prices.length == 0){
//			return 0;
//		}
//		return Math.max(solution(prices,0,-1,0), solution(prices,0,prices[0],0));
//    }
//	
//	public int solution(int[] prices, int index, int now, int profit){
//		
//		if(index == prices.length-1){
//			if(prices[index] > now && now != -1){
//				profit = profit + prices[index] - now;
//			}
//			return profit;
//		}
//		
//		if(now == -1){
//			//下一个买、不买
//			return Math.max(solution(prices,index+1,prices[index+1],profit), solution(prices,index+1,-1,profit));
//		}else{
//			//下一个卖，不卖
//			if(prices[index] >= now)
//				return Math.max(solution(prices, index+1,-1,profit +(prices[index+1] - now) ), solution(prices, index+1,now,profit ) );
//			else
//				return solution(prices, index+1,now,profit );
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		int[] a = {7,1,5,3,6,4};
		
		MaxProfit_122 m = new MaxProfit_122();
		System.out.println(m.maxProfit(a));
	}

}

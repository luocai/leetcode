package leetcode;

public class MaxCoins_312 {
	
//	public int maxCoins(int[] nums) {
//        
//		int n = nums.length + 2; //增加 -1 和 n
//		int[] helper = new int[n];
//		for(int i = 1; i < nums.length;i++){
//			helper[i] = nums[i];
//		}
//		helper[0] = helper[n-1] = 1;
//		//dp[l][r] 表示 nums中下标l到r中最大 coins 
//		int[][] dp = new int[helper.length][helper.length]; 
//		
//		//三个点（起点遍历、终点遍历、中间遍历
//		for(int i = 2; i < helper.length ;i++){
//			for(int j = 0; j < helper.length; j++){
//				int l = j; //起点
//				int r = i+j; //终点
//				for(int m = l+1; m < r; m++){
//					//终点把数据一分为二， 左边到m的最大值， m到右边的最大值
//					dp[l][r] = Math.max(dp[l][r], dp[l][m] + dp[m][r] +  helper[m-1]*helper[m]*helper[m+1]);
//				}
//			}
//		}
//		return dp[0][helper.length-1];
//    }
	
    public int maxCoins(int[] nums) {
    //DP: the result depends on the last burst balloon, which seprate the array into 2 subarray. 
    //DP: by adding 1 to head and tail, DP[i,i] = 0 and DP[i,i+2] = num[i] * num[i+1] * num[i+2]
    int n = nums.length+2;
    int[] newnums = new int[n];
    for (int i = 0;i < n - 2; i++){
        newnums[i+1] = nums[i];
    }
    newnums[0] = newnums[n - 1] = 1;
    int[][] DP = new int[n][n];
    for (int k = 2; k < n; k++){
        for (int l = 0; l + k < n; l++){
            int h = l + k;
            for (int m = l + 1; m < h; m++){
                DP[l][h] = Math.max(DP[l][h],newnums[l] * newnums[m] * newnums[h] + DP[l][m] + DP[m][h]);
            }
        }
    }
    return DP[0][n - 1];
}
	
	public static void main(String[] args) {
		int[] nums = {3,1,5,8};
		MaxCoins_312 m = new MaxCoins_312();
		System.out.println(m.maxCoins(nums));
	}

}

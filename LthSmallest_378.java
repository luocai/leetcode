package leetcode;

public class LthSmallest_378 {
//	                                     
	//思路： 1.先取 l = 左上角的最小值 ， r 取右下角的最大值
//	  2. 取 l 和 r的中间值， 然后与每一行进行比较，取得所有比该数小的数目，即求该中间值是所有数第几小的
//	  3. 如果比mid 小的数 少于 k个， 则 l = mid+1, 否则 r= r+1
//	  4. 一直循环直到 l==r 
	public int kthSmallest(int[][] matrix, int k) {
	
		int n = matrix.length;
		int l = matrix[0][0];
		int r = matrix[n-1][n-1];
		int ans = 0;
		while(l <= r){
			
			int mid = l + (r - l) /2;
			if(getSum(matrix, mid, k) < k){  //进行判断 缩小范围
				ans = mid;
				l = mid+1; // 比 mid小的数 数量少于k ，则要增加左值
			}else{
				r = mid-1;
			}
			
		}
		
      return ans;
  }
	
	public int getSum(int[][] matrix, int mid, int k){
		
		int cnt = 0;
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				if(matrix[i][j] < mid){
					cnt++;
				}
			}
		}
		
		return cnt;
		
	}
    public static void main(String[] args) {
		
    	LthSmallest_378 l = new LthSmallest_378();
    	
    	int[][] arr = new int[5][5];
    	int m = 1;
    	for(int i = 0; i < 5; i++){
    		for(int j = 0; j  < 5; j++){
    			arr[i][j] = m++;
    			System.out.print(arr[i][j]+ "  ");
    		}
    		System.out.println();
    		m = i+3;
    	}
    	
    	System.out.println(l.kthSmallest(arr, 8));
	}


}

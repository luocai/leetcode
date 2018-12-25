package dp;

public class UniquePathsWithObstacles_63 {

	
	 public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		 
		 if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0)
			 return 0;
			 
		 int m = obstacleGrid.length;
		 int n = obstacleGrid[0].length;
		 
		 if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1)
			 return 0;
		
		 int[][] dp = new int[m][n];
		 dp[0][0] = 1;
		 for(int i = 1; i < n;){
			 if(obstacleGrid[0][i] == 1){
				 while(i < n){
					 dp[0][i] = 0;
					 i++;
				 }
			 }else{
				 dp[0][i] = 1;
			 }
			 i++;
		 }
		 for(int i = 1; i < m;){
			 if(obstacleGrid[i][0] == 1){
				 while(i < m){
					
					 dp[i][0] = 0;
					 i++;
				 }
			 }else{
				 dp[i][0] = 1;
			 }
			 i++;
		 }
		 for(int i = 1; i < m; i++){
			 for(int j = 1; j < n; j++){
				 
				 if(obstacleGrid[i][j] == 1){
					 dp[i][j] = 0;
				 }else{
					 dp[i][j] = dp[i-1][j] +dp[i][j-1];
				 }
			 }
		 }
		 return dp[m-1][n-1];
	 }
	 
	 public static void main(String[] args) {
		
		 int[][] a = {{0,1,0,0,0},
					 {1,0,0,0,0},
					 {0,0,0,0,0},
					 {0,0,0,0,0}};
		 UniquePathsWithObstacles_63 u = new UniquePathsWithObstacles_63();
		 
		 System.out.println(u.uniquePathsWithObstacles(a));
	}
}

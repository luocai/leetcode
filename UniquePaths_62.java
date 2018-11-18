package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class UniquePaths_62 {
	
	// dfs 超时
//	public int uniquePaths(int m, int n) {
//
//		return solution(1,1,m,n);
//    }
//	
//	public int solution(int x, int y,int m, int n){
//		
//		if(x > m || y > n )
//			return 0;
//		
//		if(x == m && y == n){
//			return 1;
//		}
//		
//		return solution(x+1, y , m , n) + solution(x, y +1, m , n);
//		
//	}
	
	//bfs 超时
//	public int uniquePaths(int m, int n) {
//
//		return bfs(1,1,m,n);
//    }
//	
//	public int bfs(int x, int y, int m, int n){
//		
//		Queue<Integer> queue = new LinkedList<>();
//		queue.add(x);
//		queue.add(y);
//		
//		int res = 0;
//		
//		while(!queue.isEmpty()){
//			
//			int tx = queue.poll();
//			int ty = queue.poll();
//			
//			if(tx == m && ty == n)
//				res++;
//			
//			if(tx+1 <= m){
//				queue.add(tx+1);
//				queue.add(ty);
//			}
//			
//			if(ty+1 <= n){
//				queue.add(tx);
//				queue.add(ty+1);
//			}
//			
//		}
//		
//		return res;
//	}
	
	//dp
	public int uniquePaths(int m, int n) {

		int[][] dp = new int[m][n];
		
		for(int i = 0;  i < n; i++){
			dp[0][i] = 1;
		}
		for(int i = 0; i < m; i++){
			dp[i][0] = 1;
		}
		
		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++){
				
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		
		return dp[m-1][n-1];
    }
	
	public static void main(String[] args) {
		
		UniquePaths_62 u = new UniquePaths_62();
		System.out.println(u.uniquePaths(7, 3));
	}

}

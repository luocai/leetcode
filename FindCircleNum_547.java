package leetcode;

public class FindCircleNum_547 {
	
	 public int findCircleNum(int[][] M) {
		 
		 int res = 0;
		 for(int i = 0; i < M.length; i++){
			 for(int j = 0; j <M[i].length ;j++){
				 if(M[i][j] == 1){
					 dfs(M,i,j);
					 res++;
				 }
			 }
		 }
		 
		 return res;
	 }
	 
	 public void dfs(int[][] m, int i, int j){
		 
		 
		 if(i < 0 || i >= m.length || j < 0 || j >= m.length)
			 return;
		 
		 if(m[i][j] == 2)
			 return;
		 
		 if(m[i][j] == 0){
			 return;
		 }
		 
	
		 m[i][j] = 2;
		 
		 for(int x = 0; x < m.length;x++){
			 dfs(m,j, x);
		 }
		 
	 }

	 public static void main(String[] args) {
		FindCircleNum_547 f = new FindCircleNum_547();
		
		int[][] a = {{1,0,0,1},
					 {0,1,1,0},
					 {0,1,1,1},
					 {1,0,1,1}};
		
		System.out.println(f.findCircleNum(a));
	}
}

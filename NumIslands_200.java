package leetcode;

public class NumIslands_200 {
	
	public int numIslands(char[][] grid) {
        
		int res = 0;
		for(int i = 0; i < grid.length ;i++){
			for(int j = 0; j < grid[i].length ;j++){
				
				if(grid[i][j] == '1'){
					dfs(grid,i, j);
//					for(int m = 0; m < grid.length ;m++){
//						for(int n = 0; n < grid[m].length ;n++){
//							System.out.print(grid[m][n] + " ");
//						}
//						System.out.println();
//					}
//					System.out.println("。。。。");
					res++;
				}
			}
		}
		
		return res;
    }
	
	public void dfs(char[][] grid, int i, int j){
		
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
			return;
		
		if(grid[i][j] == '2')
			return;	
					
		if(grid[i][j] == '0')
			return;
		
		grid[i][j] = '2';
		
		dfs(grid, i+1,j);
		dfs(grid,i-1,j);
		dfs(grid,i,j+1);
		dfs(grid,i,j-1);	
	}
	
	public static void main(String[] args) {
		
		char[][] grid = {{'1','1','0','0','0'},
						{'1','1','0','0','0'},
						{'0','0','1','0','0'},
						{'0','0','0','1','1'}};
		
		NumIslands_200 n = new NumIslands_200();
		
		System.out.println(n.numIslands(grid));
	}

}

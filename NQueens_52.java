package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NQueens_52 {

	public static void main(String[] args) {
		
		NQueens_52 n = new NQueens_52();
		System.out.println(n.totalNQueens(4));
		
	}

	public int totalNQueens(int n) {
        
		int[] arr = new int[n];
		List<Integer> res = new ArrayList();
		
		
		solve(res, n ,arr, 0);
		
		return res.size();
    }
	
	void solve(List res,int n, int[] arr,int row){
		
		if(row == n){
			res.add("0");
			return ;
		}
		
		for(int i= 0 ; i < n; i++){
			if(check(arr, row, i)){
				arr[row] = i;
				solve(res, n, arr, row +1);
			}
		}
		
		
	}
	
	boolean check(int[] arr, int row, int line){
		
		for(int i = 0; i < row; i++){
			
			if( Math.abs(arr[i] - line) == Math.abs(i - row) || arr[i] == line){
				return false;
			}
		}
		
		return true;
	}
	
	
}

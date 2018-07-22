package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NQueens_51 {

	public static void main(String[] args) {
	
		NQueens_51 nq = new NQueens_51();
		List<List<String>> result = nq.solveNQueens(4);
		
		for(int i = 0;  i< result.size() ; i++){
			for(int j = 0; j < result.get(i).size() ;j++){
				System.out.println(result.get(i).get(j));
			}
		}
	}
	
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();
 		int[] res = new int[n];
		queens(n,res,result,0);
		return result;
    }
	
	public void queens(int n,int[] res, List<List<String>> result,int row){
		
		if(row == n){  //递归边界
			addRes(result, res);
			return;
		}
		for(int i = 0; i < n; i++){
			if(check(res,row,i)){
				res[row] = i;
				
				queens(n,res,result,row+1);
				
			}
		}
	}
	
	//检查是否合法
	public boolean check(int[] res, int row,int line){
		
		for(int i = 0; i < row; i++){
			if(Math.abs(line - res[i]) == Math.abs(row-i )){
				return false;
			}
			if(res[i] == line){
				return false;
			}
		}
		
		return true;
	}
	
	//加入结果集
	public void addRes(List<List<String>> result,int[] res){
		
		List<String> s = new ArrayList<>();
		for(int i = 0; i < res.length; i++){
			String temp = "";
			for(int j = 0; j < res.length ; j++){
				if(j!= res[i]){
					temp += ".";
				}else{
					temp += "Q";
				}
			}
			s.add(new String(temp));
		}
		result.add(s);
	}
	

}

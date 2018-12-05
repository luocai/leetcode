package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SetZeroes_73 {
	public void setZeroes(int[][] matrix) {
        
		
		Set<Integer> row = new HashSet<>(); // 行
		Set<Integer> col = new HashSet<>(); // 列
		
		for(int i = 0; i < matrix.length ; i++){
			
			for(int j = 0;j < matrix[i].length;j++){
				
				if(matrix[i][j] == 0){
					row.add(i);
					col.add(j);
				}
			}
		}
		
		for(Integer i : row){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = 0;
			}
		}
		
		for(Integer i : col){
			for(int j = 0; j < matrix.length; j++){
				matrix[j][i] = 0;
			}
		}
		
		
    }
}

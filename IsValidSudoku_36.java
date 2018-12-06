package leetcode;

import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku_36 {
	
public boolean isValidSudoku(char[][] board) {
        
		
		
		for(int i = 0;i < board.length; i++){
			Set<Character> set = new HashSet<>();
			for(int j = 0; j < board[i].length; j++){
				if(board[i][j] == '.')
					continue;
				if(set.contains(board[i][j])){
					return false;
				}else{
					set.add(board[i][j]);
				}
			}
		}
		
		for(int i = 0;i < board[0].length; i++){
			Set<Character> set = new HashSet<>();
			for(int j = 0; j < board.length; j++){
				if(board[j][i] == '.')
					continue;
				if(set.contains(board[j][i])){
					return false;
				}else{
					set.add(board[j][i]);
				}
			}
		}
		
		for(int i = 0; i < board.length; i+=3){
			for(int j = 0; j < board[i].length ; j+=3){
               
				if(cal(board, i , j) == false){
					return false;
				}
			}
		}
		
		
		return true;
    }
	
	private boolean cal(char[][] att, int i, int j){
		Set<Character> set = new HashSet<>();
		for(int x = 0; x < 3; x++ ){
			for(int y = 0; y < 3; y++){
               
				if(att[i+x][j+y] == '.')
					continue;
				if(set.contains(att[i+x][j+y])){
					return false;
				}else{
					set.add(att[i+x][j+y]);
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
char[][] a= {{'.','.','.','.','5','.','.','1','.'},
			 {'.','4','.','3','.','.','.','.','.'},
			 {'.','.','.','.','.','3','.','.','1'},
			 {'8','.','.','.','.','.','.','2','.'},
			 {'.','.','2','.','7','.','.','.','.'},
			 {'.','1','5','.','.','.','.','.','.'},
			 {'.','.','.','.','.','2','.','.','.'},
			 {'.','2','.','9','.','.','.','.','.'},
			 {'.','.','4','.','.','.','.','.','.'}};

		IsValidSudoku_36 i = new IsValidSudoku_36();
		System.out.println(i.isValidSudoku(a));
		
	}

}

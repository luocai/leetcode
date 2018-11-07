package leetcode;

public class SearchMatrix_74 {
	
	public boolean searchMatrix(int[][] matrix, int target) {
        

		//二分法
//		int l = 0, r = matrix.length-1;
//		int mid = 0;
//		while(l <= r){
//			mid = (l+r)/2;
//			if(target < matrix[mid][0]){
//				r = mid-1;
//			}else if(target == matrix[mid][0]){
//				return true;
//			}else{
//				l = mid+1;
//			}
//		}
//		
//		int temp = r;
//		l = 0; 
//		r = matrix[0].length-1;
//		while(l <= r){
//			mid = (l +r)/2;
//			if(target < matrix[temp][mid]){
//				r = mid-1;
//			}else if(target == matrix[temp][mid]){
//				return true;
//			}else{
//				l = mid+1;
//			}
//		}
		
		int m = 0;
		if(matrix == null || matrix.length == 0)
			return false;
		int n = matrix[0].length-1;
		
		while( n >= 0 && m< matrix.length){
			
			if(target > matrix[m][n]){
				m++;
			}else if(target == matrix[m][n]){
				return true;
			}else{
				n--;
			}
			
		}
		
		return false;
		
    }
	
//	public static void main(String[] args) {
//		
//		int[][] a = new int[10][10];
//		int x = 0;
//		for(int i = 0; i < 10; i++){
//			
//			for(int j =0; j< 10; j++){
//				a[i][j] = x++;
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		SearchMatrix_74 s = new SearchMatrix_74();
//		s.searchMatrix(a, 91);
//	}

}

package leetcode;

public class Rotate_48 {

	public void rotate(int[][] matrix) {
        
		//用十字架的方式思考，先把十字架转180 ，在 左对角线 取对称。到90 度的位置
		//先转180度
		
		if(matrix == null && matrix.length == 0)
			return;
		
		for(int i = 0; i < matrix.length / 2;i++){
			
			for(int j = 0; j < matrix[i].length ; j++ ){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - i - 1][j];
				matrix[matrix.length-i-1][j] = temp;
			}
		}
		
//		for(int i = 0; i < matrix.length;i++){
//			for(int j = 0; j < matrix[i].length; j++){
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
		//左对角线对称
		for(int i = 0; i < matrix.length; i++){
			for(int j = i+1; j < matrix[0].length; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
//		System.out.println();
//		for(int i = 0; i < matrix.length;i++){
//			for(int j = 0; j < matrix[i].length; j++){
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
		
    }
	
	public static void main(String[] args) {
		Rotate_48 r = new Rotate_48();
		
		int[][] a = { { 5, 1, 9,11},
					  { 2, 4, 8,10},
					  {13, 3, 6, 7},
					  {15,14,12,16}};
		
		r.rotate(a);
	}
	
	
}

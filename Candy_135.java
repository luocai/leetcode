package leetcode;

import java.util.Arrays;

public class Candy_135 {
	
	public int candy(int[] ratings) {
        
		int[] data = new int[ratings.length];
		Arrays.fill(data, 1);
		
		if(ratings == null || ratings.length == 0)
			return 0;
		
		if(ratings.length == 1)
			return 1;
		
		// 先从 左往右 ， 保证右边的一定复符合要求
		for(int i = 1; i < ratings.length ;i++){
			if(ratings[i-1] < ratings[i] ){
				
				if(data[i] <= data[i-1]){
					data[i] = Math.max(data[i], data[i-1]) + 1;
				}
				
			}else if(ratings[i-1] > ratings[i] ){
				if(data[i] >= data[i-1]){
					data[i-1] = Math.max(data[i], data[i-1]) + 1;
				}
				
			}
		}
		// 再从 右往左 ， 保证左边的一定复符合要求
		for(int j = ratings.length-1 ; j > 0; j--){
			
			if(ratings[j] > ratings[j-1]){
				if(data[j] <= data[j-1]){
					data[j] = Math.max(data[j], data[j]) + 1;
				}
			}else if(ratings[j] < ratings[j-1]){
				if(data[j] >= data[j-1]){
					data[j-1] = Math.max(data[j],data[j-1]) + 1;
				}
			}
		}
		
		int sum = 0;
		for(int i = 0;i < data.length;i++){
			System.out.print(data[i] + " ");
			sum += data[i];
		}
		return sum;
    }
	
	public static void main(String[] args) {
		
		int[] a = {1,2,87,87,87,2,1};
//		int[] a = {1,3,2,2,1};
		Candy_135 c = new Candy_135();
		
		System.out.println(c.candy(a));
	}

}

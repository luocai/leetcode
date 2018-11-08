package leetcode;

public class MaxArea_11 {
	
	//暴力法
//	public int maxArea(int[] height) {
//        
//		int max = 0;
//		
//		for(int i = 0; i < height.length; i++){
//			
//			for(int j = i+1; j < height.length; j++){
//				
//				if((j-i)*Math.min(height[i], height[j]) > max){
//					max = (j-i)*Math.min(height[i], height[j]);
//				}
//			}
//		}
//		
//		return max;
//    }
	
	//双指针法
	public int maxArea(int[] height) {
        
		int l = 0, r = height.length -1;
		int max = 0;
		
		while(l < r){		
			int area = Math.min(height[l],height[r])*(r-l);
			if(area > max)
				max = area;
			
			if(height[l] > height[r])
				r--;
			else
				l++;	
		}
		
		
		return max;
    }
	
	
	
	

}

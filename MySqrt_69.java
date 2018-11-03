package leetcode;

public class MySqrt_69 {

	 public int mySqrt(int x) {
		 
		 if(x == 0)
			 return 0;
		 
		 long res =(long) x/2;
		 long temp = x;
		 
//		 if(res == 0)
//			 return 1;
//		 //注意有些相乘数组会超界限
//		 //先把数字缩小界限
//		 while( res  > Integer.MAX_VALUE / res)
//		 {
//			 temp = res;
//			 res = res/2;
//		 }
//		 
//		 if(res * res < x){
//	
//			 for(int j = res; j < temp; j++){
//				 if(j > x/j){
//					 return j-1;
//				 }else if(j*j == x){
//					 return j;
//				 }
//			 }
//		}
//		 
		 
		 while(true){
			  if(res * res > x){
				 temp = res;
				 res = res/ 2;
			 }else{
			 
				 break;
			 }
		 }
		 
		 for(long i = res; i <= temp; i++){
			 if(i*i > x){
				 return (int)i-1;
			 }else if(i*i == x){
				 return (int)i;
			 }
		 }
		 
		 
		 return 1;
		 
	 }
	 
	 public static void main(String[] args) {
		
		 MySqrt_69 m = new MySqrt_69();
		 System.out.println(m.mySqrt(
				 2147483647));
	}
	 
	
}

package leetcode;

public class JudgeSquareSum_633 {
	
	
	public boolean judgeSquareSum(int c) {
        
		
		int l = 0, r = (int)Math.sqrt(c);
		while(l <= r){
			
			if(l*l + r*r == c){
			
				return true;
			}else if(l*l + r*r < c){
				l++;
			}else{
				r--;
			}
		}
		
		return false;
    }

	public static void main(String[] args) {
		
		JudgeSquareSum_633 j = new JudgeSquareSum_633();
		System.out.println(j.judgeSquareSum(4));
		
	}
}

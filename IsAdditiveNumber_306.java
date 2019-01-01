package leetcode_1_1;

public class IsAdditiveNumber_306 {
	
	public boolean isAdditiveNumber(String num) {
        
		boolean res = false;
		
		for(int i = 1 ; i < num.length() / 2 + 1 ;i++){
			System.out.println("i: " + i + " sub: " + num.substring(0,i));
			res = res || solution(num, i, Integer.parseInt(num.substring(0, i)));
		}
		
		return res;
    }
	
	public boolean solution(String num, int index,int pre){
		
		boolean res = false;
		for(int i = index+1; i < num.length() ;i++){
			int tsum = pre + Integer.parseInt(num.substring(index, i));
			for(int j = i+1; j < num.length();j++){
				int tt = Integer.parseInt(num.substring(i,j));
				
				if(tt == tsum){
					System.out.println("...");
					if(j == num.length()-1)
						return true;
					res = res || solution(num, j, tt);
				}
			}
		}
		return res;
	}
	
	public boolean solutions(String num, int index,int pre,int prepre){
		
		boolean res = false;
		for(int i = index+1; i < num.length() ;i++){
			int tsum = Integer.parseInt(num.substring(index, i));
			if(tsum > pre + prepre)
				break;
			if(tsum == pre + prepre){
				
				if(i == num.length() - 1)
					return true;
				res = res || solutions(num,i,tsum, pre);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		IsAdditiveNumber_306 i = new IsAdditiveNumber_306();
		
		System.out.println(i.isAdditiveNumber("199100199"));
	}

}

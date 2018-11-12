package leetcode;

public class CountAndSay_38 {
	
	public String countAndSay(int n) {
//        String[] res = new String[30];
//        res[0] = "1";
          String res = "1";
          
          for(int i = 1; i < n; i++){
        	  res = getValue(res);
        	  System.out.println(res);
          }
//        for(int i = 1;i < 30; i++){
//        	
//        	res[i] = getValue(res[i-1]);
//        	System.out.println(res[i]);
//        }
		return res;
    }
	
	public String getValue(String s){
		String tempRes = "";
		
		char tar = s.charAt(0);
		int count = 1;

		for(int i = 1; i < s.length();i++){
			if(s.charAt(i) == tar){
				count++;
			}else{
				tempRes += count;
				tempRes += tar;
				tar = s.charAt(i);
				count = 1;
			}
		}
		
		tempRes += count;
		tempRes += tar;
		
		return tempRes;
	}
	
	public static void main(String[] args) {
		CountAndSay_38 c = new CountAndSay_38();
		
		c.countAndSay(5);
		
	}

}

package leetcode;

public class GetHint_299 {
	
	public String getHint(String secret, String guess) {
        
		StringBuffer sbSec = new StringBuffer(secret);
		StringBuffer sbGue = new StringBuffer(guess);
		int ares = 0;
		int bres = 0;
		for(int i = 0; i < secret.length() && i < guess.length() ; i++){
			if(secret.charAt(i) == guess.charAt(i)){
				ares++;
				sbSec.setCharAt(i, '#');
				sbGue.setCharAt(i, '#');
			}
		}
		
		guess = sbGue.toString();
		
		for(int j = 0;j < guess.length(); j++){
			
			if(guess.charAt(j) == '#')
				continue;
			
			String s = sbSec.toString();
			
			System.out.println(guess.substring(j, j+1));
			if(s.contains(guess.substring(j, j+1))){
				
				bres++;
				sbSec.setCharAt(s.indexOf(guess.charAt(j)), '#');
			}
			
			
		}
		
		String res = ares + "A" + bres + "B";
		return res;
    }

}

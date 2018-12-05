package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RestoreIpAddresses_93 {

//	public List<String> restoreIpAddresses(String s) {
//        
//		String r = "";
//		List<String> res = new ArrayList();
//		Queue queue = new LinkedList<>();
//		
//		for(int i = 1;i <= 3; i++){
//			String t = s.substring(0,i);
//			if(Integer.parseInt(t) < 255){
////				System.out.println(t);
//				queue.add(t);
//			}
//		}
//		
//		while(!queue.isEmpty()){
//			r = 
//		}
//		
//		return null;
//    }
	
	public List<String> restoreIpAddresses(String s) {
      
		List<String> res = new ArrayList<>();
		//[0,i]
		
		if(s.length() < 4 && s.length() > 12)
			return res;
		
		for(int i = 0,ci = 0; i < s.length() && ci < 3; i++){
			//[i+1,j]
			for(int j = i+1, cj = 0; j < s.length() &&cj < 3; j++){
				//[j+1,k]
				for(int k = j+1, ck=0; k < s.length() && ck<3;k++ ){
					//[k,s.length]
					String a = s.substring(0, i+1);
					
					String b = s.substring(i+1,j+1);
					
					String c = s.substring(j+1,k+1);
					
					String d = s.substring(k+1,s.length());


					if(check(a) && check(b) && check(c) && check(d)){
						String r = a + "." + b+ "." + c+"." + d;

						res.add(r);
					}
					ck++;
				}
				cj++;
			}
			ci++;
		}
		
		return res;
  }
	
	public void dfs(String s, String temp, List<String> res, int count){
		
		if(count == 4 && check(s)){
			res.add(temp);
			return ;
		}
		
		for(int i = 1; i < s.length() ; i++){
			String str = s.substring(0, i);
			
			if(check(str)){
				dfs(s.substring(i), temp+"." + str, res, count +1);
			}
		}
		
	}
	
	public boolean check(String str){
		if(str.length() > 3 || str.length() == 0)
			return false;
		if(!String.valueOf(Integer.parseInt(str)).equals(str))
			return false;
		if(Integer.parseInt(str) <= 255 && Integer.parseInt(str) >=  0){
			return true;
		}else
			return false;
	}
	

	public static void main(String[] args) {
		RestoreIpAddresses_93 r = new RestoreIpAddresses_93();
		
		r.restoreIpAddresses("010010");
		
//		String s = "abcdeft";
//		System.out.println(s.substring(1, 2)); //[i,j)
	}
}

package leetcode;

public class IsSubsequence_392 {
	
	 public boolean isSubsequence(String s, String t) {
	     
//		 int j = 0;
//		 
//		 if(s == "")
//			 return true;
//		 
//		 if((s.length() == t.length() && s != t) || s.length() > t.length())
//			 return false;
//
//		 
//		 
//		 for(int i = 0; i < s.length() ; i++){
//			 
//			 for(; j < t.length(); j++){
//				 
//				 if(s.charAt(i) == t.charAt(j)){
//					 j++;
//					 break;
//				 }
//				 
//			 }
//			 if( j == t.length() && i != s.length()-1){
//				 return false;
//			 }
//			 
//		 }
		 
		 int i = 0, j = 0;
		 
		 while(i< s.length() && j < t.length()){
			 
			 if(s.charAt(i) == t.charAt(j)){
				 i++;
				 j++;
			 }else{
				 j++;
			 }
		 }
		 
		 if(i == s.length()){
			 return true;
		 }

		 
		 return false;
	 }
	 
	 public static void main(String[] args) { 
	
		
		 IsSubsequence_392 i = new IsSubsequence_392();
		 
		 System.out.println(i.isSubsequence("abc","abbbdc"));
	}
//	 "lyyeyyyyyeyyyeyyyytyyyyycyoyyyyyyyyyyyyydyyyyyyeyyy"

}

package leetcode;

public class Implement_strStr_28 {

	
	public int strStr(String haystack, String needle) {
		int i = 0;
		int j = 0;
		int flag = 0;
		
		if(needle.length() == 0)
			return 0;
	    for( ; i < haystack.length(); ){
	    	for ( ; j < needle.length();){
	    		
	    		if (i>=haystack.length())
	    			break ;
	    		
	    		if(needle.charAt(j) == haystack.charAt(i)){
	    			i++;
	    			j++;
	    		}else{
	    			i = i - j+1;
	    			j = 0;
	    		}
	    	}
	    	if (j == needle.length()){
	    		flag = 1;
	    		break;
	    	}
	    }
	    if (flag == 1)
	    	return i - j;
	    else
	    	return -1;
	}
	 
	
	public static void main(String[] args) {
		
		Implement_strStr_28 m = new Implement_strStr_28();
		int num = m.strStr("aaaaa", "bba");
		
		System.out.println(num);

	}

}

package leetcode;

import java.util.HashMap;

public class Main12 {

	
	 public String intToRoman(int num) {
		 HashMap<Integer, Character> hash = new HashMap<>();
		 hash.put(1, 'I');
		 hash.put(5,'V');
	     hash.put(10,'X');
	     hash.put( 50,'L');
	     hash.put(100,'C');
	     hash.put(500,'D');
	     hash.put(1000,'M');
	     
	     int[] a = new int[]{1,5,10,50,100,500,1000};
	     
	     String res = "";
	     while(num > 0){
	    	 for (int j = 6; j >= 0; j--){
	    		 if (num >= a[j]){
		    		 int len = num / a[j];
		    		 for (int i = 0; i < len; i++){
		    			 res = res + hash.get(a[j]);
		    	System.out.println(res);
		    		 }
		    		 num = num % a[j];
		    System.out.println(num);
		    	 }else if (num <= a[j] && j>= 2 && j / 2 == 0 && num >= (a[j-2]*4 + a[j-1])){
		    		 res = res + hash.get(a[j-2]) + hash.get(a[j]);
		    		 num = num - (a[j-2]*4 + a[j-1]);
		    		 
		    		 System.out.println(res);
		    		 System.out.println(num);
		    	 }else if(num <= a[j] && j>=1 && j / 2 == 1 && num >= (a[j-1]*4)){
		    		 res = res + hash.get(a[j-1]) + hash.get(a[j]);
		    		 num = num -a[j-1]*4;
		    		 System.out.println(res);
		    		 System.out.println(num);
		    	 }
	    	 }
	    	 
	     }
	     return res;
	 }
	 
	 
	public static void main(String[] args) {
		Main12 m = new Main12();
		System.out.println(m.intToRoman(4));
	}

}

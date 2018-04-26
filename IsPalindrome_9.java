package leetcode;

import java.util.Scanner;

public class IsPalindrome_9 {

	//用字符串解决
	 public boolean isPalindrome(int x) {
		 String s = String.valueOf(x);
		 boolean flag = true;
		 
		int i = 0, j = s.length()-1;
		while(i < j){
			if (s.charAt(i) != s.charAt(j)){
				flag = false;
			}
			i++;
			j--;
		}
		
		return flag;
	 }
	 
	 //不用字符串解决
	 public boolean isPalindrome1(int x){
		 
		 if (x < 0)
			 return false;
		 
		 int len = 1;
		 while(x / len >= 10){
			 len *= 10;
		 }
;
		 while (x > 0){
			 if (x/len != x%10)
				 return false;
			 
			 x %= len;
			 x /= 10;
			 len /= 100;
		 }
		 return true;
	 }
	 
	public static void main(String[] args) {
		
		Main9 m = new Main9();
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		System.out.println(m.isPalindrome1(x));

	}

}

class Reverse_7 {
    public int reverse(int x) {
		 long res = 0;//注意声明为long类型
		 
		 String s;
		 if (x > 0){
			  s = String.valueOf(x);
			  for (int i = s.length()-1; i >= 0; i--){
				  res = res*10 + s.charAt(i) - '0';
				 
//System.out.println(res);
			  }
			  
			  if (res > Integer.MAX_VALUE)
				  return 0;
			
		 }else{
			  s = String.valueOf(x);
			  for (int i = s.length()-1; i > 0; i--){
				
				  res = res*10 + s.charAt(i) - '0';
				 
//System.out.println(res);
			  }
			  
			  if (res > Integer.MAX_VALUE)
				  return 0;
			  
			  res = -res;
		 }
		 
		 return (int)res;
		 
	 }
}
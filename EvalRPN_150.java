package leetcode_12_18;

import java.util.Stack;

public class EvalRPN_150 {
	
	public int evalRPN(String[] tokens) {
		
		if(tokens.length == 0)
			return 0;
		if(tokens.length == 1)
			return trans(tokens[0]);
        
		Stack<Integer> stack = new Stack<>();
		int res = 0;
		for(int i = 0; i < tokens.length ;i++){
			
			if(tokens[i].charAt(0) == '+'){
				int a = stack.pop();
				int b = stack.pop();
				res = (a+b);
				stack.push(res);
			}else if(tokens[i].charAt(0) == '-' && tokens[i].length() == 1){
				int a = stack.pop();
				int b = stack.pop();
				res = (b-a);
				stack.push(res);
			}else if(tokens[i].charAt(0) == '*'){
				int a = stack.pop();
				int b = stack.pop();
                
				res = (b*a);
				stack.push(res);
			}else if(tokens[i].charAt(0) == '/'){
				int a = stack.pop();
				int b = stack.pop();
				res = (b/a);
				stack.push(res);
			}else{
				stack.push(trans(tokens[i]));
			}
          
		}
		
		return res;
    }
	
	public int trans(String s){
		
		boolean flag = false;
		int res = 0;
		if(s.charAt(0) == '-'){
			flag = true;
			s = s.substring(1, s.length());
			
		}
		for(int i = 0 ; i < s.length() ;i++){
			res = res*10 + (s.charAt(i) - '0');
		}
		if(flag == true)
			res = -res;
		return res;
	}
	
	public static void main(String[] args) {
		
		EvalRPN_150 e = new EvalRPN_150();
//		String[] s = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		String[] s = {"4","-2","/","2","-3","-","-"};
		System.out.println(e.evalRPN(s));
		
		
	}

}

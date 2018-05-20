package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses_20 {

	
	public boolean isValid(String s) {
		if(s.length() == 0)
			return true;
		
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		
		for(int i = 1; i < s.length(); i++){
			
		
			if(!stack.isEmpty() && map.containsKey(stack.peek()) && s.charAt(i) == map.get(stack.peek())){
				stack.pop();
			}else{
				stack.push(s.charAt(i));
			}
		}
		
		if(stack.isEmpty() == true)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		
		
		ValidParentheses_20 v = new ValidParentheses_20();
		System.out.println(v.isValid("([)]"));
	}

}

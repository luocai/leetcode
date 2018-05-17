package leetcode;

import java.util.ArrayList;
import java.util.List;

//回溯法，和22有点像，注意总结哦
public class LetterCombinations_17 {

	public List<String> letterCombinations(String digits) {
		
		List<String> result = new ArrayList<>();
		
		if (digits.length() == 0){
			return result;
		}
		
		String[] arr= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		String res = "";
		
			
		
		solve(res, 0, arr, digits, result);
		
		
		
		return result;
		
		
    }
	
	public void solve(String res, int index,String[] arr,String digits,List<String> result){
		if(index == digits.length()){
			result.add(res);
			return ;
		}
		
		for(int i = 0; i < arr[digits.charAt(index)-'0'-2].length(); i++){
			solve(res + arr[digits.charAt(index)-'0'-2].charAt(i),index+1,arr,digits,result);
		}
	}
	
	public static void main(String[] arg){
		
		LetterCombinations_17 m = new LetterCombinations_17();
		
		List<String> result = m.letterCombinations("7");
		
		for (int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}

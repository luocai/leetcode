package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordBreak_140 {
	
	//DFS 超时
//	public List<String> wordBreak(String s, List<String> wordDict) {
//        
//		List<String> res = new ArrayList<>();
//		
//		solution(res, wordDict, "",s,0,0);
//		
//		return res;
//    }
//	
//	public void solution(List<String> res, List<String> wordDict,String str,String s,int start, int index){
//		if(index == s.length()+1){
//			if(start == index-1){
////				System.out.println(start +":" + index +":" + str.substring(1,str.length())+"..");
//				res.add(new String(str.substring(1,str.length())));
//			}
//			
//			return ;
//		}
//		
//		if(wordDict.contains(s.substring(start,index))){
//			solution(res, wordDict,str + " " +s.substring(start, index),s,index, index+1);	
//			
//		}
//		solution(res, wordDict, str, s, start, index+1);
//		
//	}
	
	public List<String> wordBreak(String s, List<String> wordDict) {
		
		int length = s.length();
		boolean[] dp = new boolean[length+1];
		dp[0] = true;
		
		List<List<Integer>> preIndex = new ArrayList<>();
		
		for(int i = 0; i < length; i++){
			preIndex.add(new ArrayList<>());
		}
		preIndex.get(0).add(0);
		
		for(int i = 1; i <= length; i++){
			
			for(int j = 0; j < i ; j++){
				
				if(dp[j] && wordDict.contains(s.substring(j, i))){
					dp[i] = true;
					preIndex.get(i).add(j);
				}
				
			}
		}
		
		return null;
	}
	
	private void DFS(List<String> res, List<List<Integer>> preIndex, String s, List<String> wordDict, int length){
		
		
		
	
		
		
	}
	
	
 
	

	
	
	public static void main(String[] args) {
		
		String s = "pineapplepenapple";
		String[] temp = {"apple", "pen", "applepen", "pine", "pineapple"};
		List<String> wordDict = new ArrayList();
		
		for(int i = 0; i < temp.length ; i++)
			wordDict.add(temp[i]);
		
		WordBreak_140 w = new WordBreak_140();
		
		List<String> res = w.wordBreak(s, wordDict);
		
		for(String str: res){
			System.out.println(str);
		}
	}

}

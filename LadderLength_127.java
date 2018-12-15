package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LadderLength_127 {

	//bfs
	 public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	     
		 if(!wordList.contains(endWord)){
			 return 0;
		 }
		 Queue<String> queue = new LinkedList<>();
		 String pre = beginWord;
		 for(int i = 0; i <wordList.size() ;){
			 if(isOne(pre,wordList.get(i))){
				 if(wordList.get(i).equals(endWord)){
					 System.out.println(".");
					 return 2;
				 }
				 queue.add(wordList.get(i));
				 System.out.println(wordList.get(i));
				 wordList.remove(i);
				 continue;
			 }
			 i++;
		 }
		 System.out.println("....");
		 
		 int size = queue.size();
		 int count = 0;
		
		 while(!queue.isEmpty()){
			 pre = queue.poll();
			 size--;
			 
			 for(int i = 0; i <wordList.size() ;){
				 if(isOne(pre,wordList.get(i))){
					 if(wordList.get(i).equals(endWord)){
						
						 return count+3;


					 }
					 queue.add(wordList.get(i));
					 System.out.println(wordList.get(i));
					 wordList.remove(i);
					 continue;
				 }
				 i++;
			 }
	
		
			 System.out.println("....");
			 if(size == 0){
				 count++;
				 size = queue.size();
			 }
		 }
		 
		 
		 return count;
	 }
	 
	 public boolean isOne(String a, String b){
		 
		 int count = 0;
		 for(int i = 0; i < a.length() ;i++){
			 if(a.charAt(i) != b.charAt(i)){
				 System.out.println("naice");
				 count++;
			 }
		 }
		 
		 return count == 1? true : false;
	 }
	 
	 public static void main(String[] args) {
		
		List<String> wordList = new ArrayList<>();
//		wordList.add("hot");
//		wordList.add("dot");
//		wordList.add("dog");
//		wordList.add("lot");
//		wordList.add("log");
//		wordList.add("cog");
		wordList.add("a");
		wordList.add("b");
		wordList.add("c");
		
		LadderLength_127 l = new LadderLength_127();
		System.out.println(l.ladderLength("a", "c", wordList));
	}
}

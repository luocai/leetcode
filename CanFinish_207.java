package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class CanFinish_207 {
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        
		int[][] gra = new int[numCourses][numCourses];
		int[] indegree = new int[numCourses]; //入度
		
		//构造邻接树
		for(int i = 0; i < prerequisites.length; i++){
			
			int pre = prerequisites[i][1];
			int aft = prerequisites[i][0];
			
			indegree[aft]++;
			
			gra[pre][aft] = 1;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < indegree.length ; i++){
			if(indegree[i] == 0){
				queue.add(i);
			}
		}
		
		int count = 0;
		
		while(!queue.isEmpty()){
			
			int root = queue.poll();
			count++;
			
			for(int i = 0; i < numCourses; i++){
				
				if(gra[root][i] == 1){
					gra[root][i] = 0;
					indegree[i]--;
					if(indegree[i] == 0){
						queue.add(i);
					}
				}
			}
		}
		
		if(count ==numCourses ){
			return true;
		}
		
		return false;
    }

}

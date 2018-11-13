package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReconstructQueue_406 {
	
	public int[][] reconstructQueue(int[][] people) {
		
		List<int[]> res = new ArrayList<>();

		Arrays.sort(people,new CompareSort());	
		
		for(int i = 0; i < people.length; i++){
			
			res.add(people[i][1], people[i]);
		
		}	
		return res.toArray(new int[people.length][]);
    }
	
   class CompareSort implements Comparator<int[]>{

		public int compare(int[] o1, int[] o2) {
			
			if(o1[0] != o2[0])
				return o2[0] - o1[0];
			else
				return o1[1] - o2[1];
		}
		
	}
   
   public static void main(String[] args) {
	
	   int[][] test = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
	   
	   ReconstructQueue_406 r = new ReconstructQueue_406();
	   r.reconstructQueue(test);
   }
}

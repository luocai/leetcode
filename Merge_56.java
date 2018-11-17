package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }
public class Merge_56 {
	
	public List<Interval> merge(List<Interval> intervals) {
        
		
		
		Collections.sort(intervals, new Comparetor());
		
		for(int i = 0; i < intervals.size() -1; ){
			
			if(intervals.get(i+1).start <= intervals.get(i).end){
				
				int end ;
				if(intervals.get(i+1).end >= intervals.get(i).end){
					end = intervals.get(i+1).end;
				}else{
					end = intervals.get(i).end;
				}
				
				intervals.remove(i+1);
				intervals.get(i).end = end;
			}else{
				i++;
			}
			
		}
		
		return intervals;
    }
	
	class Comparetor implements Comparator<Interval>{

		@Override
		public int compare(Interval o1, Interval o2) {
			
			return o1.start - o2.start;
		}
		
	}

		
	

}

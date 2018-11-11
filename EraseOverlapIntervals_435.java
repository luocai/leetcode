package leetcode;

import java.util.Arrays;
import java.util.Comparator;



class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
public class EraseOverlapIntervals_435 {
	
	public int eraseOverlapIntervals(Interval[] intervals) {
        
		if(intervals.length <= 1)
			return 0;
		Arrays.sort(intervals, new MyComprator());
		
		int res = 1;
		
		int end = intervals[0].end;
		for(int i = 1; i < intervals.length; i++){
			
			if(intervals[i].start >= end){
				
				res++;
				end = intervals[i].end;
			}
			
		}
		
		
		return intervals.length - res;
    }
	
	class MyComprator implements Comparator {
	    public int compare(Object arg0, Object arg1) {
	    	Interval i1 = (Interval)arg0;
	    	Interval i2 = (Interval)arg1;
	    	
	    	return i1.end - i2.end ;
	    			
	    }
	}
	
}

package leetcode;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
 }

public class FindRightInterval_436 {
	
	public int[] findRightInterval(Interval[] intervals) {
        
		int[] res = new int[intervals.length];
		Map<Integer,Integer> map = new TreeMap<>();
		for(int i = 0; i < intervals.length;i++){			
			map.put(intervals[i].start, i);
		}
		
		Iterator<Integer> it = map.keySet().iterator();
	
		while(it.hasNext()){
			int key = it.next();
			
			System.out.println(key);
		}
		
		for(int i = 0; i < intervals.length; i++){
			
			Iterator<Integer> iter = map.keySet().iterator();
			int flag = 0;
			while(iter.hasNext()){
				int key = iter.next();
				
				
				if(key >= intervals[i].end){
					res[i] = map.get(key);
					
					
					flag = 1;
					break;
				}
	
			}
			if(flag == 0){
				res[i] = -1;
				
			}
		}
		
		return res;
    }
	
	public static void main(String[] args) {
//		
//		Map<Integer, Integer> map = new TreeMap<>();
//		
//		map.put(2, 4);
//		map.put(1, 8);
//		map.put(5, 23);
//		map.put(3, 5);
//		
//		Iterator<Integer> iter = map.keySet().iterator();
//		while(iter.hasNext()){
//			int key = iter.next();
//			System.out.println(key);
//		}
		
		Interval a = new Interval(1, 12);
		Interval b = new Interval(5, 9);
		Interval c = new Interval(3, 10);
		Interval d = new Interval(13, 14);
		Interval e = new Interval(15, 16);
		Interval f = new Interval(16, 17);
		
		Interval[] intervals = new Interval[6];
		intervals[0] = a;
		intervals[1] = b;
		intervals[2] = c;
		intervals[3] = d;
		intervals[4] = e;
		intervals[5] = f;
		
		
		FindRightInterval_436 fa = new FindRightInterval_436();
		fa.findRightInterval(intervals);
		
	}

}

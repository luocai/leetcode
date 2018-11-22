package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateTriangle_118 {
	
	public List<List<Integer>> generate(int numRows) {
        
		
		List<List<Integer>> res = new ArrayList<>();
		if(numRows == 0){
			return res;
		}
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		res.add(l1);
		if(numRows == 1)
			return res;
		List<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(1);
		
		res.add(l2);
		if(numRows == 2)
			return res;
		
		for(int i = 1; i < numRows-1; i++){
			List<Integer> temp = new ArrayList<>();
			temp.add(1);
			for(int j = 0; j < res.get(i).size()-1; j++){
				int a = res.get(i).get(j);
				int b = res.get(i).get(j+1);
				temp.add(a+b);
			}
			temp.add(1);	
			res.add(temp);
		}
		
		
		return res;
    }

}

package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

public class GetImportance_690 {
	
	public int getImportance(List<Employee> employees, int id) {
		
		Map<Integer, Employee> map = new HashMap<>();
		
		for(Employee e:employees){
			map.put(e.id, e);
		}
		
		return solution(map,map.get(id));
    }
	
	public int solution(Map<Integer,Employee> map,Employee e){
		
		if(e.subordinates.size() == 0){
			return e.importance;
		}
		
		int r = e.importance;
		for(Integer in: e.subordinates){
			r += solution(map,map.get(in));
		}
		return r;	
	}

}

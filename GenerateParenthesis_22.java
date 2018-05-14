package leetcode;

import java.util.ArrayList;
import java.util.List;

//�õݹ��˼·����ע��ݹ�����ж�
public class GenerateParenthesis_22 {

	
	public List<String> generateParenthesis(int n) {
		
		if (n == 0)
			return null;
        String str = "";
        
        List<String> result = new ArrayList<String>();
        
        solve(n,n,str,result);
        
        return result;
    }
	
	public void solve(int leftNum, int rightNum, String s,List<String> result){
		
		if (leftNum > rightNum)
			return;
		
		if(leftNum == rightNum && leftNum == 0){
			result.add(s);
		}
		
		if (leftNum >= 0)
			solve(leftNum-1,rightNum,s + '(',result);
		if (rightNum >= 0)
			solve(leftNum, rightNum - 1, s + ')', result);
	}
	public static void main(String[] args) {
		
		GenerateParenthesis_22 g = new GenerateParenthesis_22();
		List<String> list = g.generateParenthesis(3);
		for (int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}

	}

}

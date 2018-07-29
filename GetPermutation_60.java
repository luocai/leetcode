package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GetPermutation_60 {

	public static void main(String[] args) {
		
		GetPermutation_60 g = new GetPermutation_60();
//		System.out.println(g.getPermutation(4, 9));
		g.getPermutation(4, 9);
	}
	
	public String getPermutation(int n, int k) {
        
		List<String> res = new ArrayList();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = i+1;
		}
		solve(res, arr, 0, n);
		
		Collections.sort(res);
		for(int i = 0;  i <res.size() ; i++){
			System.out.println(res.get(i));
		}
		return res.get(k-1);
    }
	
	public void solve(List<String> res, int[] arr,int index, int n){
		
		if(index == n){
			res.add(toString(arr));
		}
		
		for(int i = index; i < n; i++){
			
			swap(arr, index, i);
			solve(res, arr, index +1, n);
			swap(arr, index, i);
			
		}
		
		
		
	}
	
	public void swap(int[] arr, int i, int j){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public String toString(int[] res){
		String s = "";
		for(int i = 0; i < res.length ; i++){
			s += res[i];
		}
//System.out.println(s);
		return new String(s);
	}
	
	

}

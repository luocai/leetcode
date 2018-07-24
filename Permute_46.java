package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permute_46 {

	public static void main(String[] args) {
		
		Permute_46 p = new Permute_46();
		int[] a = {1,2,3};
		List<List<Integer>> res = p.permute(a);
		for(int i = 0;  i < res.size(); i++){
			System.out.println(res.get(i));
		}
	}
	
	public List<List<Integer>> permute(int[] nums) {
        
		List<List<Integer>> res = new ArrayList();
		List<Integer> num = new ArrayList();
		for(int i = 0;  i< nums.length; i++){
			num.add(nums[i]);
		}
		solve(res, new ArrayList(), num);
		
		return res;
    }
	
	public void solve(List<List<Integer>> res,List<Integer>r, List<Integer> nums){
		
		if(nums.size() == 0){
			res.add(new ArrayList(r));
			return;
		}
		
		for(int i = 0; i < nums.size() ; i++){
			
			
			
			List<Integer> num = new ArrayList<>(nums);
			num.remove(i); //剔除
			List<Integer> tr = new ArrayList<>(r);
			tr.add(nums.get(i));
			
			solve(res, tr,num);
			
		
		}
		
		
	}
	
	//法二 交换法 省空间
//	private void dfs(List<List<Integer>> res, int[] nums, int j) {
//        if (j == nums.length) {
//            List<Integer> temp = new ArrayList<Integer>();
//            for (int num : nums) temp.add(num);
//            res.add(temp);
//        }
//        for (int i = j; i < nums.length; i++) {
//            swap(nums, i, j);
//            dfs(res, nums, j+1);
//            swap(nums, i, j);
//        }
//    }
//    private void swap(int[] nums, int m, int n) {
//        int temp = nums[m];
//        nums[m] = nums[n];
//        nums[n] = temp;
//    }
//

}

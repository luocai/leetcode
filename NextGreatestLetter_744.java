package leetcode;

public class NextGreatestLetter_744 {
	
	public char nextGreatestLetter(char[] letters, char target) {
        
		
		if(letters[letters.length-1] <= target)
			return letters[0];
		
		int l = 0, r = letters.length-1;
		
		int mid = 0;
		
		while(l <= r){
			
			mid = (l + r) / 2;
			
			if(target >= letters[mid]){

				l = mid + 1;
			}else{

				r = mid - 1;
			}
		}
		
		return letters[l];
    }

}

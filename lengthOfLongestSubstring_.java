//无重复字符的最长子串暴力解法，但是超时了。。
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")){
            return 0;
        }
        boolean flag1 = true;
    	int maxSize = 0;
    	String str = String.valueOf(s.charAt(0));
		int j = 1, k = 0;
		for (; j < s.length(); ){
			boolean flag = true;
			for (; k < str.length(); ){	
				if (s.charAt(j) == str.charAt(k)){
					flag = false;
                    flag1 = false; // 有不同的
					if(str.length() >= maxSize){
						maxSize = str.length();
					}	
                    j = j-str.length()+2;
					str = String.valueOf(s.charAt(j-1));
					
					k = 0;
					break;
				}else{
					k++;
				}
			}
			if (flag == true){
				str = str + s.charAt(j);
				k = 0;
				j++;
			}
		}
        if(flag1 == true){ // 如果s每个字母都不相同，则结果就是它的长度
            maxSize = s.length();
        }
        if (str.length() >= maxSize){
			maxSize = str.length();
		}
		return maxSize;
    }
}
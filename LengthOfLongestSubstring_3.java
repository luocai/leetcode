//无重复字符的最长子串暴力解法，但是超时了。。
class LengthOfLongestSubstring_3 {
	
	//1.暴力解法 超时
  /*  public int lengthOfLongestSubstring(String s) {
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
    }*/
	
	// 正确解法
	public int lengthOfLongestSubstring(String s) {  
        if(s.length()<=1){  
            return s.length();  
        }  
        String temp = s.substring(0,1);  
        int maxlength = 1;  
  
        for(int i=1;i<s.length();i++){  
            if(!temp.contains(String.valueOf(s.charAt(i)))){  
                temp += s.charAt(i);  
            }else{  
                if(maxlength<temp.length()){  
                    maxlength = temp.length();  
                }  
                temp = temp.substring(temp.indexOf(s.charAt(i))+1) + String.valueOf(s.charAt(i));  
            }  
        }  
        if(maxlength < temp.length()){  
            maxlength = temp.length();  
        }  
        return maxlength;  
    }  
	
	//另一种写法
	/*public int lengthOfLongestSubstring(String s) {
    	if (s.equals(""))
    		return 0;
    	int maxSize = 1;
    	List<Character> list = new ArrayList<>();
    	list.add(s.charAt(0));
    	
    	for (int i = 1; i < s.length(); i++){
    		if(list.contains(s.charAt(i))){
    			int index = list.indexOf(s.charAt(i));
    			list = list.subList(index+1, list.size());
    			list.add(s.charAt(i));
    			maxSize = Math.max(maxSize, list.size());
    		}else{
    			list.add(s.charAt(i));
    			maxSize = Math.max(maxSize, list.size());
    		}
    	}
    	
    	return maxSize;
    }*/
}
package leetcode_1_04;

public class DecodeString_394 {
	
	//下标问题？递归下如何同步？
	public String decodeString(String s) {
	
		Integer x = 3;
		
//		return DFS(s,0);
		return MyDfs(s,0);
    }
	
	public String solution(String res,String s, int index,int n, String re){
		
		if(index == s.length())
			return re;
		
		if(s.charAt(index) >= '0' && s.charAt(index) <= '9'){
			String t =  solution(res, s,index+1,s.charAt(index) - '0', "");
			return solution(res, s, t.length() / (s.charAt(index) - '0') + 3,n,re + t);
		}else if( s.charAt(index) == '['){
			return solution(res, s, index+1, n, re);
		}else if(s.charAt(index) == ']'){
			String r = "";
			for(int i = 0; i < n ;i++){
				r  += re;
			}
			System.out.println(r);
			return solution(res, s, index+1,n,r);
		}else{
			return solution(res,s, index+1, n,re + s.charAt(index));
		}
		
	}
	
	public String DFS(String s,int index){
		
		String res = "";
		int n = 0;
		
		while(index < s.length()){
			
			if(s.charAt(index) >= '0' && s.charAt(index) <= '9'){
				n = n*10 + s.charAt(index) - '0';
				index++;
			}
			else if(s.charAt(index) == '['){
				String item = DFS(s, index+1);
				for(int i  = 0;i < n; i++) 
					res += item;
				int cc = 1;
				int len = 1;
				for(int i = index+1; cc != 0; i++){
					if(s.charAt(i) == ']')
						cc--;
					else if(s.charAt(i) == '[')
						cc++;
					len++;
				}
//				System.out.println("bef "+index);
				index += len;
//				System.out.println("af "+index);
				n = 0;
			}else if(s.charAt(index) == ']'){
				index++;
				
				return res;
			}else{
				res += s.charAt(index++);
			}
		}
	
		return res;
		
	}
	
	public String MyDfs(String s, int index){
		
		String res = "";
		int n  =0;
		
		while(index< s.length()){
			System.out.println(index);
			if(s.charAt(index) >= '0' && s.charAt(index) <= '9'){
				
				n = n*10 + s.charAt(index)-'0';
				index++;
			}else if(s.charAt(index) == '['){
				String item = MyDfs(s,index+1);
				for(int i = 0; i<n; i++)
					res += item;
				System.out.println(res);
				int cc = 1;
				int len = 1;
				for(int i  = index+1; cc != 0; i++){
					if(s.charAt(i) == '[')
						cc++;
					else if(s.charAt(i) == ']')
						cc--;
					len++;
				}
				index = index +len;
				n=0;
			}else if(s.charAt(index) == ']'){
				index++;
				return res;
			}else{
				res += s.charAt(index++);
			}
			
		}
		return res;
		
	}
	
	

	public static void main(String[] args) {
		
		DecodeString_394 d = new DecodeString_394();
		System.out.println(d.decodeString("3[z]"));
		//zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkef
		//zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkef
	}
}

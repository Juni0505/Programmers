package level0;

public class CompareTwoNumbers {
	public int solution(int a, int b) {
		
			String str1 = Integer.toString(a);
			String str2 = Integer.toString(b);
			String str3 = str1+str2;
			int result = Integer.parseInt(str3);
			if(result > (a*b*2)) {
				return result;
			}else {
				return (a*b*2);
			}
	    }
	}
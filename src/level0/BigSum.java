package level0;

public class BigSum {
	public int solution(int a, int b) {
		String str1 = Integer.toString(a);
		String str2 = Integer.toString(b);
		String str3 = str1+str2;
		String str4 = str2+str1;
		int result = Integer.parseInt(str3);
		int result1 = Integer.parseInt(str4);
		if(result > result1) {
			return result;
		}else {
			return result1;
		}
    }
}

package level0;

public class ReturnFlag {
	public int solution(int a, int b, boolean flag) {
		int result = 0;
		if (flag == true) {
			result = (a) + (b);
		}else if(flag == false) {
			result = (a) - (b);
		}
		return result;
	}
}

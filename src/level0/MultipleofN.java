package level0;

public class MultipleofN {
	public int solution(int num, int n) {
		int result = 0;
        if(num%n == 1) {
        	result = 0;
        }else if(num%n == 0) {
        	result = 1;
        }
        return result;
    }
}

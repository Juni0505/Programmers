package level0;

public class Factorial {
	public int solution(int n) {
        int answer = 0;
        int m = 1;
        for(int i = 1; i <= n; i++) {
        	m *= i;
        	if(m > n) {
        		answer = i-1;
        		break;
        	}else if(m == n ) {
        		answer = i;
        	}
        }
        return answer;
    }
}

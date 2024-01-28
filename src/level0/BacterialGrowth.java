package level0;

public class BacterialGrowth {
	public int solution(int n, int t) {
        int answer = 0;
        for(int i = 1; i <= t; i++) {
        	answer += n * i;
        }
        return answer;
    }
}

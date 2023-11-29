package level1;

import java.util.Arrays;

public class Budget {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int b = budget;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i ++) {
        	if(b >= d[i]) {
        		b -= d[i];
        		answer++;
        	}else {
        		break;
        	}
        }
        return answer;
    }
}

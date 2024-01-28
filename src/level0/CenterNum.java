package level0;

import java.util.Arrays;

public class CenterNum {
	public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int a = array.length / 2;
        answer = array[a];
        return answer;
    }
}

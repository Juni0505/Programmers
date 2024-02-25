package level0;

import java.util.Arrays;

public class AMakeB {
	public int solution(String before, String after) {
        int answer = 1;
        char[] bef = before.toCharArray();
        char[] aft = after.toCharArray();
        Arrays.sort(bef);
        Arrays.sort(aft);
        before = String.valueOf(bef);
        after = String.valueOf(aft);
        if(before.equals(after) != true ) {
        	answer = 0;
        }
        return answer;
    }
}

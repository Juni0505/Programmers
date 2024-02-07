package level0;

import java.util.Arrays;

public class MaxNum2 {
	public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int a = numbers[0] * numbers[1];
        int b = numbers[numbers.length-1] * numbers[numbers.length-2];
        if(a < b) {
        	return b;
        }else {
        	return a;
        }
        
    }
}

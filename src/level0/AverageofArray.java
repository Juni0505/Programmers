package level0;

public class AverageofArray {
	 public double solution(int[] numbers) {
	        double answer = 0;
	        int num = 0;
	        for(int i = 0; i < numbers.length; i++) {
	        	answer += numbers[i];
	        	num ++;
	        }
	        answer = answer/num;
	        return answer;
	    }
}

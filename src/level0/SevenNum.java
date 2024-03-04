package level0;

public class SevenNum {
	 public int solution(int[] array) {
	        int answer = 0;
	        for (int num : array) {
	            while (num > 0) {
	                if (num % 10 == 7) { 
	                    answer++;
	                }
	                num /= 10; 
	            }
	        }
	       return answer;
	    }
}

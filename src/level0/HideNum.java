package level0;

public class HideNum {
	 public int solution(String my_string) {
	        int sum = 0;
	        for (char ch : my_string.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                sum += Character.getNumericValue(ch);
	            }
	        }
	        return sum;
	    }
}

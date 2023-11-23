package level1;

import java.util.Arrays;

public class ReverseNum {
	 public int[] solution(long n) {
		 	String a = String.valueOf(n);
		    int[] answer = new int[a.length()];
	        StringBuilder sb = new StringBuilder();
	        sb.append(a);
	        sb.reverse();
	        a = sb.toString();
	        for(int i = 0; i < a.length(); i++) {
	        	answer[i] = Character.getNumericValue(a.charAt(i));
	        }
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		ReverseNum rn = new ReverseNum();
		System.out.println(Arrays.toString(rn.solution(1000000000)));
	}
}

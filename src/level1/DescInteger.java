package level1;

import java.util.Arrays;

public class DescInteger {
	
	 public long solution(long n) {
	        long answer = 0;
	        
	        String s = String.valueOf(n);
	        int[] array = new int[s.length()];
	        for(int i = 0; i < array.length; i++) {
	        	array[i] = Character.getNumericValue(s.charAt(i));
	        }
	       Arrays.sort(array);
	       for (int i = 0; i < array.length / 2; i++) {
	            int temp = array[i];
	            array[i] = array[array.length - i - 1];
	            array[array.length - i - 1] = temp;
	        }
	       StringBuilder sb = new StringBuilder();
	       for(int i = 0; i< array.length; i++) {
	    	   sb.append(array[i]);
	       }
	       s = sb.toString();
	       answer = Long.parseLong(s);
	        
	        return answer;
	    }
}

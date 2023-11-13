package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArray2 {
	
	 public int[] solution(int l, int r) {
		 	ArrayList<Integer> nl = new ArrayList<Integer>();
	        
	        for(int i = l; i <= r; i++) {
	        	String num = Integer.toString(i);
	        	if (num.matches("[50]+")) {
	                int num1 = Integer.valueOf(num);
	                nl.add(num1);
	            }
	        }
	        if(nl.isEmpty() == true) {
	        	nl.add(-1);
	        }
	        int[] answer = new int[nl.size()];
	        for(int i = 0; i<nl.size(); i++) {
	        	answer[i] = nl.get(i);
	        }
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		CreateArray2 ca = new CreateArray2();
		int l = 5;
		int r = 555;
		System.out.println(Arrays.toString(ca.solution(l, r)));
	}
}

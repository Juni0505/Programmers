package level0;

import java.util.ArrayList;

public class CountUp {
	 public ArrayList<Integer> solution(int start_num, int end_num) {
	        ArrayList<Integer> answer = new ArrayList<Integer>();
	        
	        for(int i = start_num; i <= end_num; i++) {
	        	answer.add(i);
	        }
	        
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		CountUp cu = new CountUp();
		System.out.println(cu.solution(3, 7));
				
	}
}

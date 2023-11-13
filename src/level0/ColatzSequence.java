package level0;

import java.util.ArrayList;
import java.util.List;

public class ColatzSequence {
	public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(n);
        while(n != 1) {
        	if( n % 2 ==0) {
        		answer.add(n/2);
        		n = n/2;
        	}else if(n % 2 == 1) {
        		answer.add(3*n+1);
        		n = 3*n+1;
        	}
        }
		
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		ColatzSequence cs = new ColatzSequence();
		System.out.println(cs.solution(10));
	}
}

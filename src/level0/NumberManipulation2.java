package level0;

public class NumberManipulation2 {

	
	public String solution(int[] numLog) {
        String answer = "";
        for(int i = 0; i < numLog.length-1; i++ ) {
        	
        	if(numLog[i+1] - numLog[i] == 1) {
        		answer += "w";
        	}else if(numLog[i+1] - numLog[i] == -1 ) {
        		answer += "s";
        	}else if(numLog[i+1] - numLog[i] == 10 ) {
        		answer += "d";
        	}else if(numLog[i+1] - numLog[i] == -10 ) {
        		answer += "a";
        	
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		NumberManipulation2 nm = new NumberManipulation2();
		int [] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};	
		System.out.println(nm.solution(numLog));
		
	}
}

package level1;

public class StrtransInt {
	   public int solution(String s) {
	        int answer = 0;
	        if(s.charAt(0)== '-') {
	        	answer = Integer.parseInt(s);
	        	Integer.reverse(answer);
	        }else {
	        	answer = Integer.parseInt(s);
	        }
	        return answer;
	    }
	   
	   
}

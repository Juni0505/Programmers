package level1;

public class FindKim {
	 public String solution(String[] seoul) {
		 int a = 0;
	       for(int i = 0; i< seoul.length; i++) {
	    	   if(seoul[i].contains("Kim")) {
	    		   a = i;
	    	   }
	       }
		 	String answer = "김서방은 "+a+"에 있다";
	        return answer;
	    }
}

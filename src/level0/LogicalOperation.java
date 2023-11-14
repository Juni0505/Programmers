package level0;

public class LogicalOperation {

	 public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
	        boolean answer = true;
	        boolean v = true;
	        boolean A = true;
	        // (x1 ∨ x2) ∧ (x3 ∨ x4)
	       if(x1 == false && x2 == false) {
	    	   v = false;
	       } else {
	    	   v = true;
	       }
	       if(x3 == false && x4 == false) {
	    	   A = false;
	       } else {
	    	   A = true;
	       }
	       if(v == true && A == true) {
	    	   answer = true;
	       } else {
	    	   answer = false;
	       }
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		LogicalOperation lo = new LogicalOperation();
		System.out.println(lo.solution(false, true, true, true));
	}
		
}

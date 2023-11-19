package level1;

public class FindOneRest {
	
	public int solution(int n) {
		 for (int x = 2; x < n; x++) {
		        if (n % x == 1) {
		            return x;
		        }
		    }
		    return n - 1; 
    }
	
	
}

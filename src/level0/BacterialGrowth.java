package level0;

public class BacterialGrowth {
	 public int solution(int n, int t) {
	        for(int i = 1; i <= t; i++) {
	        	n *= 2;
	        }
	        return n;
	    }
}

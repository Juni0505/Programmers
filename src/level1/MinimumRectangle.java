package level1;

public class MinimumRectangle {
	public int solution(int[][] sizes) {
	        int answer = 0;
	        int max = 0;
	        int min = 0;
	       
	        for(int i = 0; i< sizes.length; i++) {
	        	int temp;
	        	int a = 0;
	 	        int b = 0;
	        	a = sizes[i][0];
	        	b = sizes[i][1];
	        	if(a < b) {
	        		temp = a;
	        		a = b;
	        		b = temp;
	        	}
	        	if(a > max) {
	        		max = a;
	        	}
	        	if(b > min) {
	        		min = b;
	        	}
	        }
	        answer = max*min;
	        return answer;
	    }
}

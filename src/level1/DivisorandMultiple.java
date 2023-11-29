package level1;

public class DivisorandMultiple {
	
	
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int multi = 0;
        int divisor = 0;
        if(n > m) {
        	for(int i = 1; i<= m; i++) {
        		if(n % i ==0 && m % i ==0) {
        			divisor = i;
        		}
        	}
        } else {
        	for(int i =1; i <=n; i++) {
        		if(n % i ==0 && m % i ==0) {
        			divisor = i;
        		}
        	}
        }
        
        
        multi = n*m/divisor;
        answer[0] = divisor;
        answer[1] = multi;
        return answer;
    }
}

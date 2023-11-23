package level1;

public class SquareRootDiscrimination {
	public long solution(long n) {
        long answer = 0;
        for(long a = 0; a <= n; a++ ) {
        	if(a*a == n) {
        		a+=1;
        		answer = a*a;
        		break;
        	}else if(a == n) {
        		answer = -1;
        		break;
        	}
        	
        }
        return answer;
    }
	public static void main(String[] args) {
		SquareRootDiscrimination srd = new SquareRootDiscrimination();
		
		System.out.println(srd.solution(1));
	}
	
}

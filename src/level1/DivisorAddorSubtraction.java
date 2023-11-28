package level1;

public class DivisorAddorSubtraction {
	public int solution(int left, int right) {
        int answer = 0;
        int a = 0;
        for(int i = left; i <= right; i++) {
        	for(int j = 1; j <= i; j++) {
        		if(i%j == 0) {
        			a++;
        		}
        	}
        	if(a % 2 == 1 || a == 1) {
        		answer = answer - i;
        	}else {
        		answer = answer + i;
        	}
        	a = 0;
        }
        return answer;
    }
	public static void main(String[] args) {
		DivisorAddorSubtraction das = new DivisorAddorSubtraction();
		System.out.println(das.solution(13, 17));
	}
}

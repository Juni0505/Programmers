package level0;

public class NumberManipulation {

	
	public int solution(int n, String control) {
        int answer = 0;
        
        for(int i = 0; i < control.length(); i++) {
        	if(control.charAt(i) == 'w') {
        		n += 1;
        	}	else if(control.charAt(i) == 's') {
        		n -= 1;
        	}	else if(control.charAt(i) == 'd') {
        		n += 10;
        	}	else if(control.charAt(i) == 'a') {
        		n -= 10;
        	}
        }
        answer = n;
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		NumberManipulation nm = new NumberManipulation();
		System.out.println(nm.solution(0, "wsdawsdassw"));
	}
}

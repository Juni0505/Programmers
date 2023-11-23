package level1;

public class HarshadNum {
	public boolean solution(int x) {
        boolean answer = true;
        String s = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
        	sum += Character.getNumericValue(s.charAt(i));
        }
        if(x % sum == 0) {
        	answer = true;
        }else {
        	answer = false;
        }
        return answer;
    }
}

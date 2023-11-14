package level0;

public class DividedNine {
	 public int solution(String number) {
	        int answer = 0;
	        int sum = 0;
	        char a;
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0; i < number.length(); i++) {
	        	a = number.charAt(i);
	        	sb.append(a);
	        	sum += Integer.parseInt(sb.toString().substring(i));
	        }
	        answer = sum % 9;
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		String number = "123";
		DividedNine dn = new DividedNine();
		System.out.println(dn.solution(number));
		
	}
}

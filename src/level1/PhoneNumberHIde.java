package level1;

public class PhoneNumberHIde {
	 public String solution(String phone_number) {
	        String answer = "";
	        StringBuilder sb = new StringBuilder();
	        sb.append(phone_number);
	        for(int i = 0; i < sb.length()-4; i++) {
	        	sb.replace(i, i+1, "*");
	        }
	        answer = sb.toString();
	        return answer;
	    }
}

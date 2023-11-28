package level1;

import java.util.Arrays;

public class StrDesc {
	public String solution(String s) {
        String answer = "";
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        StringBuilder sb = new StringBuilder();
        sb.append(cArr);
        sb.reverse();
        answer = sb.toString();
        
        return answer;
    }
	
	public static void main(String[] args) {
		StrDesc sd = new StrDesc();
		System.out.println(sd.solution("abcdefZ"));
	}
	
}

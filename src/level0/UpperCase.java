package level0;

public class UpperCase {
	public String solution(String str, String alp) {
			String answer = str.replaceAll(alp, alp.toUpperCase());

		return answer;
	}
}

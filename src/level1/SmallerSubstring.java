package level1;

public class SmallerSubstring {
	public int solution(String t, String p) {
		int answer = 0;
		int l = p.length();
		for (int i = 0; i <= t.length(); i++) {
			if(i+l > t.length()) {
				break;
			}
			
			String s = t.substring(i, i + l);
			long a = Long.parseLong(s);
			long b = Long.parseLong(p);
			
			if (!s.isEmpty() && a <= b) {
				answer++;
				System.out.println(answer);
			}
		}

		return answer;
	}
}

package level1;

public class ThreeWayStsytemReverse {
	public int solution(int n) {
        int answer = 0;
        String s = "";
        s = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        s = sb.toString();
        answer = Integer.parseInt(s,3);
        return answer;
    }
}

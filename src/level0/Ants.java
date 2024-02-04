package level0;

public class Ants {
	public int solution(int hp) {
		int answer = 0;
		int a = hp / 5;
		int b = hp / 5 / 3;
		int c = b % 3;
		answer = a+b+c;
		return answer;
	}
}

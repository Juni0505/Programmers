package level0;

public class EquidistantSequence {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int answer = 0;
		boolean[] included = { true, false, false, true, true };
		for (int i = 0; i < included.length; i++) {
			if (included[i] == true) {
				answer += a + (b*i);
			}
			
		}
		System.out.println(answer);
	}
}

package level1;

import java.util.Arrays;

public class KNumber {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length]; // 3
		int n = 0;

		for (int i = 0; i < commands.length; i++) {
			int k = 0;

			int[] arr = new int[commands[i][1] - commands[i][0] + 1];
			for (int j = commands[i][0]; j <= commands[i][1]; j++) {
				arr[k++] = array[j - 1]; 
			}
			Arrays.sort(arr);
			answer[n++] = arr[commands[i][2] - 1];
		}
		return answer;
	}
}
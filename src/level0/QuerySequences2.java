package level0;

import java.util.Arrays;

public class QuerySequences2 {

	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];

		
		for (int i = 0; i < queries.length; i++) {
		    int index1 = queries[i][0];
		    int index2 = queries[i][1];
		    int index3 = queries[i][2];
		    int min = -1;

		    for (int j = index1; j <= index2; j++) {
	            if (arr[j] > index3) {
	                if (min == -1 || arr[j] < min) {
	                    min = arr[j];
	                }
	            }
	        }
	        answer[i] = min;
		}
		return answer;
	}

	public static void main(String[] args) {
		QuerySequences2 qs3 = new QuerySequences2();
		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } };
		System.out.println(Arrays.toString(qs3.solution(arr, queries)));

	}
}

package level0;

import java.util.Arrays;

public class QuerySequences3 {

	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = {};
		for (int i = 0; i < queries.length; i++) {
	        int index1 = queries[i][0];
	        int index2 = queries[i][1];
	        int temp = arr[index1];
	        arr[index1] = arr[index2];
	        arr[index2] = temp;
	    }
		answer = arr;
	    return answer;
	}

	public static void main(String[] args) {
		QuerySequences3 qs3 = new QuerySequences3();
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] queries = {{0,3}, {1,2}, {1,4}};
		System.out.println(Arrays.toString(qs3.solution(arr, queries)));

	}
}

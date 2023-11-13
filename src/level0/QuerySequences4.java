package level0;

import java.util.Arrays;

public class QuerySequences4 {

	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i = 0; i < queries.length; i++) {
        	int index1 = queries[i][0];
        	int index2 = queries[i][1];
        	int index3 = queries[i][2];
        	
        	for(int j = index1; j <= index2; j++) {
        		if(j % index3 == 0) {
        			arr[j]++;
        		}
        	}
        	
        }
        answer = arr;
        return answer;
    }

	public static void main(String[] args) {
		QuerySequences4 qs3 = new QuerySequences4();
		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] queries = {{0,4,1}, {0,3,2}, {0,3,3}};
		System.out.println(Arrays.toString(qs3.solution(arr, queries)));

	}
}

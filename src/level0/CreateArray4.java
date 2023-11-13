package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArray4 {
	public int[] solution(int[] arr) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (result.isEmpty() || result.get(result.size()-1) < arr[i]) {
				result.add(arr[i]);
			} else if(result.get(result.size()-1) >= arr[i] ) {
				result.remove(result.size()-1);
			}
		}
		int[] stk = new int[result.size()];
		for(int j = 0; j < result.size(); j++) {
			stk[j] = result.get(j);
		}
		
		return stk;
	}

	public static void main(String[] args) {
		 CreateArray4 ca = new CreateArray4();
		    int[] arr = { 1, 4, 2, 5, 3 };
		    System.out.println(Arrays.toString(ca.solution(arr)));
	}
}

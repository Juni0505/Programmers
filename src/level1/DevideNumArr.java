package level1;

import java.util.ArrayList;
import java.util.Collections;

public class DevideNumArr {
	 public int[] solution(int[] arr, int divisor) {
	     	ArrayList<Integer> al = new ArrayList<Integer>();
		 	for(int i = 0; i < arr.length; i++) {
		 		if(arr[i] % divisor == 0) {
		 			al.add(arr[i]);
		 		}
		 	}
		 	Collections.sort(al);
		 	if(al.isEmpty()) {
		 		int[] answer = new int[1];
		 		answer[0] = -1;
		 		return answer;
		 	}else {
		 		int[] answer = new int[al.size()];
		 		for(int i = 0; i< al.size(); i++) {
		 			answer[i] = al.get(i);
		 		}
		 		return answer;
		 	}
		 	
	    }
}
	
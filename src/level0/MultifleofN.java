package level0;

import java.util.ArrayList;

public class MultifleofN {
	 public int[] solution(int n, int[] numlist) {
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        for(int i = 0; i < numlist.length; i++) {
	        	if(numlist[i]%n == 0) {
	        		arr.add(numlist[i]);
	        	}
	        }
	        int[] arr1 = new int[arr.size()];
	        for(int i = 0; i < arr.size(); i++) {
	        	arr1[i] = arr.get(i);
	        }
	        return arr1;
	    }
}

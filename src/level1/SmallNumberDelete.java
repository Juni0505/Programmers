package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallNumberDelete {
	  public int[] solution(int[] arr) {
		  int min = Integer.MAX_VALUE;
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  if(arr.length == 1) {
			  int[] answer = new int[1];
			  answer[0] = -1;
			  return answer;
		  }
	        for(int i = 0; i < arr.length; i++) {
        		if(arr[i] < min) {
        			min = arr[i];
        		}
        	}
        	for(int i = 0; i < arr.length; i++) {
        		if(arr[i] != min) {
        			list.add(arr[i]);
        			System.out.println(list);
        		}
        	}
        	 int[] answer = new int[list.size()];
        	for(int i =0; i < list.size(); i++) {
        		answer[i] = list.get(i);
        	}
	        return answer;
	    }
	  public static void main(String[] args) {
		  SmallNumberDelete snd = new SmallNumberDelete();
		  int [] arr = {1, 3, 5,7,9};
		  System.out.println(Arrays.toString(snd.solution(arr)));
	}
}

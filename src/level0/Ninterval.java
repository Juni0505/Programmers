package level0;

import java.util.ArrayList;
import java.util.List;

public class Ninterval {
	public List<Integer> solution(int[] num_list, int n) {
       List<Integer> arr = new ArrayList<>();
       for(int i = 0; i < num_list.length; i+=n) {
    	   arr.add(num_list[i]);
       }
       
       
       return arr;
    }
}

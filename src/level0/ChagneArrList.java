package level0;

import java.util.ArrayList;
import java.util.List;

public class ChagneArrList {
	public List<Integer> solution(int[] num_list, int n) {
        List<Integer> arr = new ArrayList<Integer>();
        
        for(int i = n; i < num_list.length; i++) {
        	arr.add(num_list[i]);
        }
        for(int i = 0; i < n; i++) {
        	arr.add(num_list[i]);
        }
        return arr;
    }
}

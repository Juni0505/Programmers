package level0;

import java.util.ArrayList;
import java.util.List;

public class NstartArr {
	public List<Integer> solution(int[] num_list, int n) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = n-1; i < num_list.length; i++) {
        	arr.add(num_list[i]);
        }
        
        return arr;
    }
}

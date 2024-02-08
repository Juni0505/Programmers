package level0;

import java.util.ArrayList;

public class FindDivisor {
	public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) {
        	if(n%i == 0) {
        		arr.add(i);
        	}
        }
        
        return arr;
    }
}

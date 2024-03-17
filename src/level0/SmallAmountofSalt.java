package level0;

import java.util.*;


public class SmallAmountofSalt {
	public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                arr.add(i);
                n /= i;
            }
        }
        
        if (n > 1) {
            arr.add(n);
        }
        
        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        
        Collections.sort(arr);
        
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        
        return result;
    }
}

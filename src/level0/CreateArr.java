package level0;

import java.util.ArrayList;
import java.util.List;

public class CreateArr {
	public List<Integer> solution(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        for (int i = k; i <= n; i += k) {
            arr.add(i);
        }
        return arr;
    }
}

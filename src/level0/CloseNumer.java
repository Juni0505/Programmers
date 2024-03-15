package level0;

public class CloseNumer {
	public int solution(int[] array, int n) {
        int closest = array[0];
        int minDiff = Math.abs(n - array[0]);
        
        for (int num : array) {
            int diff = Math.abs(n - num);
            if (diff < minDiff || (diff == minDiff && num < closest)) {
                closest = num;
                minDiff = diff;
            }
        }
        
        return closest;
    }
}

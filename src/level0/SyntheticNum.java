package level0;

public class SyntheticNum {
	public int solution(int n) {
        int count = 0; 
        
        for (int i = 4; i <= n; i++) {
            int divisors = 0; 
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisors++; 
                }
            }
            
            if (divisors >= 3) {
                count++;
            }
        }
        
        return count;
    }
}

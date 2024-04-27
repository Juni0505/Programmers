package level0;

public class BinaryNumber {
	public String solution(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int a = 0; 
        
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        while (i >= 0 || j >= 0 || a > 0) {
            int sum = a; 
            if (i >= 0) sum += bin1.charAt(i--) - '0'; 
            if (j >= 0) sum += bin2.charAt(j--) - '0'; 
            
            result.append(sum % 2);
            a = sum / 2; 
        }
        
        return result.reverse().toString();
    }
}

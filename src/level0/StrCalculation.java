package level0;

public class StrCalculation {
	public int solution(String myString) {
        String[] arr = myString.split(" ");
        
        int result = Integer.parseInt(arr[0]);
        
        for (int i = 1; i < arr.length; i += 2) {
            String s = arr[i]; 
            int operand = Integer.parseInt(arr[i + 1]); 
            
            if (s.equals("+")) {
                result += operand;
            } else if (s.equals("-")) {
                result -= operand;
            }
        }
        
        return result;
    }
}

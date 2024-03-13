package level0;

public class HIdeNum2 {
	public int solution(String my_string) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        
        if (sb.length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }
        
        return sum;
    }
}

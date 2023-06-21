package level0;

public class ConditionString {
	public int solution(String ineq, String eq, int n, int m) {
		int result = 0;
		if(ineq.equals(">")) {
			if(eq.equals("=")) {
				if(n >= m) {
					result = 1;
				}else
					result = 0;
			} else if(eq.equals("!")) {
				if(n > m) {
					result = 1;
				} else
					result = 0;
			}
		}else if(ineq.equals("<")) {
			if(eq.equals("=")) {
				if(n <= m) {
					result = 1;
				}else
					result = 0;
			}else if(eq.equals("!")) {
				if(n < m) {
					result = 1;
				}else
					result = 0;
			}
		}
       
        return result;
    }
}
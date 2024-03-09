package level0;

import java.util.Stack;

public class ControlZ {
	public int solution(String s) {
        String[] elements = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for (String element : elements) {
            if (element.equals("Z")) {
                int removed = stack.pop();
            } else {
                stack.push(Integer.parseInt(element));
            }
        }
        
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        return sum;
    }
}

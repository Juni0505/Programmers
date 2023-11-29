package level1;

import java.util.Stack;

public class HateSameNum {

	public int[] solution(int[] arr) {
		
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(s.empty() == true) {
				s.push(arr[i]);
			}else if(s.peek() != arr[i]) {
				s.push(arr[i]);
			}
		}
		int[] answer = new int[s.size()];
		int a = s.size()-1;
		while (!s.isEmpty()) {
			answer[a] = s.pop();
		    a--;
		}
		return answer;
	}

}

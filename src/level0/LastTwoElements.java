package level0;


public class LastTwoElements {
	
	
	 public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length+1];
	        int lastNum = 0;
	        int midNum = 0;
	        int add = 0;
	        for(int i = 0; i < num_list.length; i++) {
	        	answer[i] = num_list[i];
	        	if(i == num_list.length-1) {
	        		lastNum = num_list[i];
	        	}
	        	if(i == num_list.length-2) {
	        		midNum = num_list[i];
	        	}
	        	if(lastNum > midNum) {
	        		add = lastNum- midNum;
	        	}else {
	        		add = lastNum*2;
	        	}
	        	if(i == num_list.length-1) {
	        	answer[i+1] = add;
	        	}
	        }
	        
	        return answer;
	    }
}

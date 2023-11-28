package level1;

public class FIndAbsentNumber {
	
	public int solution(int[] numbers) {
        int a = 0;
		int answer = 45;
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = 0; j < 10; j++) {
        		if(numbers[i] == j) {
        			a += numbers[i];
        		}
        	}
        }
        
        return answer-a;
    }
	
	
}

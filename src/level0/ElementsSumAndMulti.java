package level0;

public class ElementsSumAndMulti {
	
	
	public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multi = 1;
        for(int i = 0; i < num_list.length; i++) {
        	sum += num_list[i];
        	multi *= num_list[i];
        }
        sum = sum * sum;
        if(sum < multi) {
        	answer = 0;
        }else if(sum > multi){
        	answer = 1;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		ElementsSumAndMulti esam = new ElementsSumAndMulti();
		int[] num_list = {5,7,8,3};
		System.out.println(esam.solution(num_list));
		
	}
}

package level0;

public class ConnectedNumber {

	 public int solution(int[] num_list) {
	        int answer = 0;
	        String a = "";
	        String b = "";
	        for(int i = 0; i < num_list.length; i++ ) {
	        	if(num_list[i] % 2 == 0) {
	        		a += num_list[i];
	        		System.out.println(a);
	        	}else if(num_list[i] % 2 ==1) {
	        		b += num_list[i];
	        		System.out.println(b);
	        	}
	        }
	        int a1 = Integer.valueOf(a);
	        int b1 = Integer.valueOf(b);
	        answer = a1+b1;
	        return answer;
	    }
	 
	 
	 public static void main(String[] args) {
		ConnectedNumber cn = new ConnectedNumber();
		int[] num_list = {3, 4, 5, 2, 1};
		System.out.println(cn.solution(num_list));
	}
	
}

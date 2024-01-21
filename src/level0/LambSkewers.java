package level0;

public class LambSkewers {
	public int solution(int n, int k) {
        int answer = 0;
        // n = 양꼬치, k는 음료수
        int num = n/10;
        if(num > 0) {
        	k = k-num;
        	answer = (n*12000)+(k*2000);
        }else {
        	answer = (n*12000)+(k*2000);
        }
        return answer;
    }
}

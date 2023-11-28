package level1;

public class InsufficientMoney {
	public long solution(int price, int money, int count) {
        long answer = 0;
        long pSum = 0;
        long a = price;
        for(int i = 0; i < count; i++) {
        	pSum += a;
        	a = a+price;
        	System.out.println("pSum : "+ pSum);
        }
        if(pSum > money) {
        	answer = (long)pSum-money;
        }
        return answer;
    }
	public static void main(String[] args) {
		InsufficientMoney im = new InsufficientMoney();
		System.out.println(im.solution(3, 20, 4));
	}
}

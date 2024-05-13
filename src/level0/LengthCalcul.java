package level0;

public class LengthCalcul {
	public int solution(int[] num_list) {
        int sum = 0;
        int a = 1;

        if (num_list.length >= 11) {
            for (int num : num_list) {
                sum += num;
            }
            return sum <= 10 ? sum : sum;
        } else {
            for (int num : num_list) {
                a *= num;
            }
            return a;
        }
    }
}

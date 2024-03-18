package level0;

import java.util.HashMap;
import java.util.Map;

public class HateEnglish {
	public long solution(String numbers) {
        String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<String, Integer> numberMap = new HashMap<>();
        
        for (int i = 0; i < 10; i++) {
            numberMap.put(numberWords[i], i);
        }
        
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < numbers.length()) {
            for (int i = 1; i <= 10; i++) {
                if (numberMap.containsKey(numbers.substring(index, index + i))) {
                    sb.append(numberMap.get(numbers.substring(index, index + i)));
                    index += i;
                    break;
                }
            }
        }
        
        return Long.parseLong(sb.toString());
    }
}

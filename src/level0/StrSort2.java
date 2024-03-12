package level0;

import java.util.*;

public class StrSort2 {
	public String solution(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

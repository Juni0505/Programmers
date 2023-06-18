package level0;

import java.util.Scanner;

public class UpDownCasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder result = new StringBuilder();
	        for(int i = 0; i < a.length(); i++) {
	        	char ch = a.charAt(i);
	        	if(Character.isUpperCase(ch)) {
	        		result.append(Character.toLowerCase(ch));
	        	}else if(Character.isLowerCase(ch)) {
	        		result.append(Character.toUpperCase(ch));
	        	}else
	        		result.append(ch);
	        }	System.out.println(result);
	}

}

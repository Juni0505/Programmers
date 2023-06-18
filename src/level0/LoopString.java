package level0;

import java.util.Scanner;

public class LoopString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int count = 0;
        
       if(str.length() > 0 && str.length() < 11 && n < 6 && n > 0){
          while(true){
              System.out.print(str);
              count++;
              if(count == n)
                  break;
          }
           
           }
	}

}

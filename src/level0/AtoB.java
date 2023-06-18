package level0;

import java.util.Scanner;

public class AtoB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(-100000 <= a && a <= 100000)
            System.out.println("a = " + a);
        if(-100000 <= b && b <= 100000)
            System.out.println("b = " + b);
	}

}

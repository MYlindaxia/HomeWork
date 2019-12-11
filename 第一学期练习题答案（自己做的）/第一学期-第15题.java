package Code;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		int d;
		int f;
		int e;
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a < b) {
			if (a < c) {
				System.out.println("a最小" + a);
				if (b < c) {
					System.out.println(b);
					System.out.println(c);
				} else {
					System.out.println(b);
					System.out.println(c);
				}
			}
		}
		if (b < c) {
			if (b < a) {
				System.out.println("b最小" + b);
				if (c < a) {
					System.out.println(a);
					System.out.println(c);
				} else {
					System.out.println(a);
					System.out.println(c);
				}
			}
		}
		if (c < a) {
			if (c < b) {
				System.out.println("c最小" + c);
				if (a < b) {
					System.out.println(a);
					System.out.println(b);
				} else {
					System.out.println(a);
					System.out.println(b);
				}
			}
		}

	}
}
package Code;

import java.util.Scanner;

import javax.swing.JFrame;

public class HelloWorld {
	public static void main(String[] args) {
		int m = 100000;
		int m1 = 200000;
		int m2 = 400000;
		int m3 = 600000;
		int m4 = 1000000;
		long m5 = 999999999999999l;
		System.out.println("请输入工资");
		Scanner scan = new Scanner(System.in);
		int Money = scan.nextInt();
		if (Money < m) {
			System.out.println("您的奖金是：" + Money * 0.1);
		} else if (Money < m1) {
			System.out.println("您的奖金是：" + (Money - 10000) * 0.075
					+ (10000 * 0.1));
		} else if (Money < m2) {
			System.out.println("您的奖金是：" + (Money - 10000) * 0.075
					+ (10000 * 0.1) + (200000 * 0.05));
		} else if (Money < m3) {
			System.out.println("您的奖金是：" + (Money - 10000) * 0.075
					+ (10000 * 0.1) + (200000 * 0.05) + (200000 * 0.03));
		} else if (Money < m4) {
			System.out.println("您的奖金是：" + (Money - 10000) * 0.075
					+ (10000 * 0.1) + (200000 * 0.05) + (200000 * 0.03)
					+ (400000) * 0.015);
		} else if (Money < m5) {
			System.out.println("您的奖金是：" + (Money - 10000) * 0.075
					+ (10000 * 0.1) + (200000 * 0.05) + (200000 * 0.03)
					+ (400000) * 0.015 + (Money - 1000000) * 0.01);

		}

	}
}

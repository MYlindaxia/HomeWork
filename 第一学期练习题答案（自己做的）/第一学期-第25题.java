package Code;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
		System.out.println("����������");
		Scanner scan1 = new Scanner(System.in);
		int i = scan1.nextInt();
		String s = String.valueOf(i);
		char[] c = s.toCharArray();
		if (c[0] == c[4] && c[1] == c[3]) {
			System.out.println("�ǻ�����");
		} else {
			System.out.println("���ǻ�����");
		}

	}
}

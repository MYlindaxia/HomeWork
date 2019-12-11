package Code;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		int m1 = 2;
		int m2 = 1;
		int m3 = 0;
		int z1 = 1;
		int z2 = 1;
		int z3 = 0;
		int Total = 0;
		int Total1 = 0;
		int q1 = 0;
		int q2 = 0;
		for (int i = 1; i <= 20; i++) {
			for (int i1 = 1; i1 < 2; i1++) {
				q1 = m1;
				m3 = m1;
				m1 = m1 + m2;

			}
			for (int z = 1; z < 2; z++) {
				q2 = z1;
				z3 = z1;
				z1 = z1 + z2;

			}
			Total = q1 / q2;
			Total1 += Total;
			System.out.println(Total1);
			m2 = m3;
			z2 = z3;

		}
	}

}

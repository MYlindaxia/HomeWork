package Code;

import javax.swing.JFrame;

public class HelloWorld {
	public static void main(String[] args) {
		int i1;
		int i2;
		int b;
		int c;
		int q;
		int q1;
		for (b = 0; b < 1000; b++) {
			for (i1 = 0; i1 < 1000; i1++) {
				for (i2 = 0; i2 < 1000; i2++) {
					if ((b + 100) == (i1 * i1) & (b + 168) == (i2 * i2)) {
						System.out.println(b);
					}
				}
			}
		}
	}
}

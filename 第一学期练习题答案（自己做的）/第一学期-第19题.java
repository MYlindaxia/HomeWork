package Code;

public class jt1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int z = 3; z >= 1; z--) {
			for (int q = 1; q <= 4 - z; q++) {
				System.out.print(' ');
			}
			for (int q = 1; q <= 2 * z - 1; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

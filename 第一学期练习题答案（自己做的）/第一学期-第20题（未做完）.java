package Code;

public class Test1204 {

	public static void main(String[] args) {
		int z = 2;
		int z1 = 1;
		int z2 = 0;
		int z3 = 0;
		int e1 = 2;
		int e2 = 1;
		int e3 = 0;
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j < 2; j++) {
				System.out.println(z);
				z2 = z;
				z = z + z1;

			}
			z3 = z2;
			z1 = z3;
		}
		for (int q = 1; q <= 20; q++) {
			for (int w = 1; w < 2; w++) {
				System.out.println(e1);
				e3 = e1;
				e1=e1+e2;
			}
			e2=e3;
		}
//
	}

}
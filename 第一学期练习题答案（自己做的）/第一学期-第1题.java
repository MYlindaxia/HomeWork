package Code;

public class jt1 {
	public static void main(String[] args) {
		int jx4 = 1;
		int jx5 = 0;
		int jx6 = 0;
		for (int i = 1; i <= 10; i++) {
			jx6 += jx5;
			jx5 = 0;
			jx5 += jx4;
			jx4 = 0;
			jx4 += jx6;
			System.out.println(jx4 + jx5 + jx6);
			jx6 += jx5;
			jx5 = 0;
			jx5 += jx4;
			jx4 = 0;
			jx4 += jx6;
			System.out.println(jx4 + jx5 + jx6);
			jx6 += jx5;
			jx5 = 0;
			jx5 += jx4;
			jx4 = 0;
			jx4 += jx6;
			System.out.println(jx4 + jx5 + jx6);
		}
	}

}

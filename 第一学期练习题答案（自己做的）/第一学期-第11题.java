package Code;

public class ops {
	public static void main(String[] args) {
		int g = 0;
		int s = 0;
		int b = 0;
		int z = 0;
		for (g = 1; g <= 4; g++) {
			for (s = 1; s <= 4; s++) {
				for (b = 1; b <= 4; b++) {
					if (g != s && s != b && g != b) {
						z = z + 1;
						System.out.println((b * 100) + (s * 10) + g);
					}
				}
			}
		}
		System.out.println("змЪ§га" + z);

	}

}

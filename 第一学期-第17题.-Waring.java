package Code;

public class Test1204 {

	public static void main(String[] args) {
		int j = 0;
		int j1 = 0;
		int j2 = 0;
		int j3 = 0;
		int j4 = 0;
		int j5 = 0;
		int j6 = 0;
		int j7 = 0;
		int j8 = 0;
		for (int i = 2; i < 100; i++) { // 第一天
			j = i / 2 - 1; // 第二天的数据
			for (int i1 = j; i1 < 100; i1++) { // 第二天
				j1 = i1 / 2 - 1; // 第三天的数据
				for (int i2 = j1; i2 < 100; i2++) { // 第三天
					j2 = i2 / 2 - 1; // 第四天的数据
					for (int i3 = j2; i3 < 100; i3++) { // 第四天
						j3 = i3 / 2 - 1; // 第五天的数据
						for (int i4 = j3; i4 < 100; i4++) { // 第五天
							j4 = i4 / 2 - 1; // 第六天的数据
							for (int i5 = j4; i5 < 100; i5++) {
								j5 = i5 / 2 - 1;
								for (int i6 = j5; i6 < 100; i6++) {
									j6 = i6 / 2 - 1;
									for (int i7 = j6; j6 < 99; j6++) {
										j7 = i7 / 2 - 1;
										for (int i8 = i7; i8 < 99; i8++) {
											j8 = i8 / 2 - 1;
											for (int i9 = 1; i9 == j8;) {
												System.out.println(i);

											}
										}
									}
								}
							}
						}
					}
				}

			}
		}

	}

}
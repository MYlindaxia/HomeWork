
	public static void main(String[] args) {
		int years;
		int Total = 0;
		System.out.println("Please Enter years");
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		System.out.println("Please Enter Month");
		int m = scan.nextInt();
		System.out.println("Please Enter Day");
		int d = scan.nextInt();
		if (y % 4 == 0 && y % 100 != 0) {
			System.out.println("是闰年");
			if (m == 1) {
				Total = 0;
			}
			if (m == 2) {
				Total = 31;
			}
			if (m == 3) {
				Total = 31 + 29;
			}
			if (m == 4) {
				Total = 31 + 29 + 31;
			}
			if (m == 5) {
				Total = 31 + 29 + 31 + 30;
			}
			if (m == 6) {
				Total = 31 + 29 + 31 + 30 + 31;
			}
			if (m == 7) {
				Total = 31 + 29 + 31 + 30 + 31 + 30;
			}
			if (m == 8) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31;
			}
			if (m == 9) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
			}
			if (m == 10) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;

			}
			if (m == 11) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
			if (m == 12) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;

			}

			System.out.println("zheyiniaguoqul" + (d + Total));
		} else if (y % 400 == 0) {
			System.out.println("是闰年");
			years = 366;
			if (m == 1) {
				Total = 0;
			}
			if (m == 2) {
				Total = 31;
			}
			if (m == 3) {
				Total = 31 + 29;
			}
			if (m == 4) {
				Total = 31 + 29 + 31;
			}
			if (m == 5) {
				Total = 31 + 29 + 31 + 30;
			}
			if (m == 6) {
				Total = 31 + 29 + 31 + 30 + 31;
			}
			if (m == 7) {
				Total = 31 + 29 + 31 + 30 + 31 + 30;
			}
			if (m == 8) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31;
			}
			if (m == 9) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
			}
			if (m == 10) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;

			}
			if (m == 11) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
			if (m == 12) {
				Total = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;

			}
			System.out.println("zheyiniaguoqul" + (d + Total));
		} else {
			System.out.println("不是闰年");
			years = 365;
			if (m == 1) {
				Total = 0;
			}
			if (m == 2) {
				Total = 31;
			}
			if (m == 3) {
				Total = 31 + 28;
			}
			if (m == 4) {
				Total = 31 + 28 + 31;
			}
			if (m == 5) {
				Total = 31 + 28 + 31 + 30;
			}
			if (m == 6) {
				Total = 31 + 28 + 31 + 30 + 31;
			}
			if (m == 7) {
				Total = 31 + 28 + 31 + 30 + 31 + 30;
			}
			if (m == 8) {
				Total = 31 + 28 + 31 + 30 + 31 + 30 + 31;
			}
			if (m == 9) {
				Total = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			}
			if (m == 10) {
				Total = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;

			}
			if (m == 11) {
				Total = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
			if (m == 12) {
				Total = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;

			}
			System.out.println("这年过去了" + (d + Total));
		}

	}


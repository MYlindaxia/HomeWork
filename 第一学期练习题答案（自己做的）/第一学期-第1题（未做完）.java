package Code;

public class Test {
	public static void main(String[] args) {
		int timer1 = 1;
		int timer2 = 0;
		int timer3 = 0;
		int timer4 = 0;
		int x = 1;
		int d = 0;
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		for (;; timer1++) {
			if (timer1 == 1 & d != 0) {
				x1 +=d;
				timer2++;

			}
			if (timer1 == 2 & d != 0) {
				x2 = d;
				timer2++;
				timer3++;
			}
			if (timer1 == 3 & d != 0) {
				x3 = d;
				timer2++;
				timer3++;
				timer4++;
			}
			if (timer2 == 2) {
				x = x1;
				d += x;
				x1 = 0;
				timer2 = 0;
			}
			if (timer3 == 2) {
				x = x2;
				d += x;
				x2= 0;
				timer3 = 0;

			}
			if (timer4 == 2) {
				x = x3;
				x3 = 0;
				d += x;
				timer4 = 0;
			}
			if (timer1 == 3) {
				d += x;
				x = 0;
				x1= d;
				timer1 = 0;
			}
			System.out.println(d+x+x1+x2+x3);
		}
		
	}
}

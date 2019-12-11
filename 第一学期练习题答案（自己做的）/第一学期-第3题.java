public class jiajian {
	public static void main(String[] args) {
		for (int q = 100; q <= 999; q++) {
			int a = q/100;
			int b = q%100/10;
			int c = q%100%10/1;
			if(q==(a*a*a)+(b*b*b)+(c*c*c)){
				System.out.println(q);
			}
			
			
		}
	}

}

package lll;

public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 90;
		int k = 2;
		
		while(k<90){
			if(n==k){
				System.out.println(n);
			}
			if (n != k && n % k == 0){
				
					System.out.println(k);
					n = n/k;
			}else{
				k = k+1;
			}
		}

	}

}

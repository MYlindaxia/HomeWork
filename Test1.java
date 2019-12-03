package lll;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int little = 1;
		int old = 1;
		int t = 0;
		int m = 1;
		
		while(true){
			if(m==1 || m==2){
				
			}else{
				t = old;
				old = old+little;
				little = t;
			}
			m++;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(old);
			
			
		}

	}

}

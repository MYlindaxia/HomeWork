package lll;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 111;
		
		int x  =153/100;
		int y = 153%100/10;
		int z = 153%10;
		
		if(x*x*x+y*y*y+z*z*z==i){
			System.out.println("ok");
		}else{
			System.out.println("nook");
		}
		
	}

}

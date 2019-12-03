package lll;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=101;i<=200;i++){
			
			for(int j = 2;j<=i;j++){
				if(j==i){
					System.out.println(i);
				}
				if(i%j==0){
					break;
				}
			}
			
			
		}

	}

}

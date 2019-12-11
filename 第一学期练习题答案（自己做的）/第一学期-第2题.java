package Code;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		int Total = 100;
		boolean isLive = false;
		int Total1 = 0;
		int sum = 0; 
		for (int i1 = 101; i1 <= 200; i1++) {
			for (int i2 = 2; i2 < i1; i2++) {
				if(i1%i2==0){
					isLive = true;
					break;
				}
				if(i1%i2!=0){
					sum++;
					if(sum==(i1-2)){
						System.out.println(i1);
						sum = 0;
						break;
					}
				}
			}
			
		
			if(isLive==true){
				Total--;
				isLive = false;
				Total1 = Total;
			}
		}
		System.out.println("ÓÐËØÊý"+Total+"¸ö");
	}

}

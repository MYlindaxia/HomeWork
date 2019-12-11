package Code;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		long sum1 = 1;
		long sum2 = 1;
		long sum3 = 0;
		for(int i1 = 1;i1<=20;i1++){
			for(int i2 = 1;i2<=i1;i2++){				
				sum1 = sum1 *i2;						
				sum2 = sum2 *sum1;	//i2所有的阶乘1
				sum1 = 1;
			}
		
			sum3 = sum3 +sum2;	 //1~20的答案1 3
			sum2 = 1;
			sum1 = 1;
			
		}
		System.out.println(sum3);
		
	}
}

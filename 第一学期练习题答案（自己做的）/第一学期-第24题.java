package Code;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		int w;
		int q;
		int b;
		int s;
		int g;
		System.out.println("请输入不大于五位的整数");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		w = i / 10000;
		q = i % 10000 / 1000;
		b = i % 10000 % 1000 / 100;
		s = i % 10000 % 1000 % 100 / 10;
		g = i % 10000 % 1000 % 100 % 10 / 1;
		if(w==0){
			if(q==0){
				if(b==0){
					if(s==0){
						if(g!=0){
							System.out.println("個位數");
						}
					}
					if(s!=0){
						System.out.println("二位數");
					}
				}
				if(b!=0){
				System.out.println("三位數");
				}
			}
			if(q!=0){
			System.out.println("四位數");
			}
		}
		if(w!=0){
			System.out.println("五位數");
		}
	}
}

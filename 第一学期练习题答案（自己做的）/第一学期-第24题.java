package Code;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		int w;
		int q;
		int b;
		int s;
		int g;
		System.out.println("�����벻������λ������");
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
							System.out.println("��λ��");
						}
					}
					if(s!=0){
						System.out.println("��λ��");
					}
				}
				if(b!=0){
				System.out.println("��λ��");
				}
			}
			if(q!=0){
			System.out.println("��λ��");
			}
		}
		if(w!=0){
			System.out.println("��λ��");
		}
	}
}

package Code;

import java.util.Scanner;

public class huiwenshu {
	public static void main(String[] args) {
		System.out.println("������5λ�����ж��Ƿ�Ϊ������");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int w;
		int q;
		int b;
		int s;
		int g;
		w = i/10000;
		q = i%10000/1000;
		b = i%10000%1000/100;
		s = i%10000%1000%100/10;
		g = i%10000%1000%100%10/1;
		if(w==g){
			if(q==s){
				System.out.println("�ǻ�����");
			}else{
				System.out.println("���ǻ�����");
			}
		}else{
			System.out.println("���ǻ�����");

		}
		
		
		
	}

}

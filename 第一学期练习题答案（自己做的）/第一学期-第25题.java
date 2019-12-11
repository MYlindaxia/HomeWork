package Code;

import java.util.Scanner;

public class huiwenshu {
	public static void main(String[] args) {
		System.out.println("请输入5位数来判断是否为回文数");
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
				System.out.println("是回文数");
			}else{
				System.out.println("不是回文数");
			}
		}else{
			System.out.println("不是回文数");

		}
		
		
		
	}

}

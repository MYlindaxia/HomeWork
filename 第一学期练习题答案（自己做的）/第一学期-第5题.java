package Code;

import java.util.Scanner;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
			System.out.println("������ɼ�");
			Scanner scan = new Scanner(System.in);
			int chengji = scan.nextInt();
			String dj = chengji>=90 ? "A" : chengji>=60 ? "B" : "C";		//����������Ǵ�������ִ�еģ�����
			System.out.println(dj);
			
	}
}
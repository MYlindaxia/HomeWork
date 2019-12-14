package Code;

import java.util.Scanner;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
			System.out.println("请输入成绩");
			Scanner scan = new Scanner(System.in);
			int chengji = scan.nextInt();
			String dj = chengji>=90 ? "A" : chengji>=60 ? "B" : "C";		//条件运算符是从右向左执行的！！！
			System.out.println(dj);
			
	}
}
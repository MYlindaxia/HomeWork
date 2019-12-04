/*

输入两个正整数m和n，求其最大公约数和最小公倍数。

*/

//创建键盘录入

import java.util.Scanner;

class day818_lx{

public static void main(String[]args){

//创建键盘录入对象

Scanner ab=new Scanner(System.in);

System.out.println("请输入第一个数据:");

int one = ab.nextInt();

System.out.println("请输入第二个数据:");

int tow =ab.nextInt();

dx(one,tow);//dx=大小

}

/*

返回值类型：void

参数列表：int

*/

public static void dx(int one,int tow){

int diyi =one;//记录输入的第一个整数

int dier =tow;//记录输入的第二个整数

int x=0,y=0;

if(one<tow){

x=tow;

tow=one;

one=x;

}

while (tow !=0){//判断 除数不等于0

y= one%tow;//用较大的数除以较小的数

one=tow;

tow=y;

}

//最小值

int l = diyi*dier/one;

System.out.print(diyi+"和"+dier+"的最大公约数为:"+one);

System.out.print(diyi+"和"+dier+"的最小公倍数为:"+l);

}

}

 
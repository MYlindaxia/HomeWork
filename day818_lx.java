/*

��������������m��n���������Լ������С��������

*/

//��������¼��

import java.util.Scanner;

class day818_lx{

public static void main(String[]args){

//��������¼�����

Scanner ab=new Scanner(System.in);

System.out.println("�������һ������:");

int one = ab.nextInt();

System.out.println("������ڶ�������:");

int tow =ab.nextInt();

dx(one,tow);//dx=��С

}

/*

����ֵ���ͣ�void

�����б�int

*/

public static void dx(int one,int tow){

int diyi =one;//��¼����ĵ�һ������

int dier =tow;//��¼����ĵڶ�������

int x=0,y=0;

if(one<tow){

x=tow;

tow=one;

one=x;

}

while (tow !=0){//�ж� ����������0

y= one%tow;//�ýϴ�������Խ�С����

one=tow;

tow=y;

}

//��Сֵ

int l = diyi*dier/one;

System.out.print(diyi+"��"+dier+"�����Լ��Ϊ:"+one);

System.out.print(diyi+"��"+dier+"����С������Ϊ:"+l);

}

}

 
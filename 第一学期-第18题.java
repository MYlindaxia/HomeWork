package Code;
public class Test1204 {

	public static void main(String[] args) {
int c =0;
int a = 0;
int b = 0;
int c1 =0;
int a1 = 0;
int b1 = 0;
for(c=1;c<=3;c++){
	if(c!=1){
		if(c!=3){
			c1 = c;

		}
	}

}
for(a =1;a<=3;a++){
	if(a!=1){
		if(a!=c1){
			a1=a;
		}	
	}

}
for(b=1;b<=3;b++){
	if(b!=c1){
		if(b!=a1){
			b1 =(6-a1-c1);
		}
		
	}
}
if(c1==1){
	System.out.println("c��x��");
}
if(c1==2){
	System.out.println("c��y��");
}
if(c1==3){
	System.out.println("c��z��");
}
if(b1==1){
	System.out.println("b��x��");
}
if(b1==2){
	System.out.println("b��y��");
}
if(b1==3){
	System.out.println("b��z��");
}
if(a1==1){
	System.out.println("a��x��");
}
if(a1==2){
	System.out.println("a��y��");
}
if(a1==3){
	System.out.println("a��z��");
}


	}

}
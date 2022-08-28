package modifier;

final class Class_modifier {
	
public void m1()
{int a=90;
int b=77;
a=a+b;// 167
b=a-b;//90
a=a-b;//167-90=77

System.out.println("b=="+b);
System.out.println("a=="+a);
	

}
public static void sub()
{
	int a=99;
	int b=88;
	System.out.println("Subtraction=="+(a-b));
}
	
}

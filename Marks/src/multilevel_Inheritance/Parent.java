package multilevel_Inheritance;

public class Parent extends Grand_Parent{
	
	int a=123;
	static int b=234;

public void add()
{
	int c=super.a+a;//77+123
	System.out.println("addition=="+c);
	int d=Grand_Parent.b+Parent.b;//44+234
	System.out.println("addition=="+d);
	
}
}

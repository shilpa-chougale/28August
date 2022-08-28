package single_inheritance;

public class Parent {
	int a=99;
	int b=85;
	public void add()
	{
		int c=a+b;
		System.out.println("Addtion =="+c);
	}
	
	public void sub()
	{
		int c=a-b;
		System.out.println("Subtraction =="+c);
	}
	public static void m1()
	{
		System.out.println("static method");
	}

}

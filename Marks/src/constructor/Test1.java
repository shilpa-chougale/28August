package constructor;

public class Test1 {
	public Test1()
	{
		System.out.println("Constructor 1 is running");
		
	}
	Test1(int a,int b)
	{
	this();
	System.out.println("Constructor 2 is running");
		
	}
	Test1(int a,char b)
	{
		this(10,90);
		System.out.println("Constructor 3 is running");
	}
public static void main(String args[])
{
	new Test1(80,'n');
}
}

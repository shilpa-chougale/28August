package student;

public class Returntype {
	public void m1()
	{
		System.out.println("non static method");
		
	}
	public static void main(String args[])
	{
	Returntype r1=new Returntype();
	r1.m1();
	r1.m1(10,20);
	r1.m2(67,99);
	boolean z=r1.my();
	System.out.println(z);
	}

	public void m1(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of "+c);
	}
	public boolean m2(int a,int b)
	{
		int c=a+b;
		System.out.println("addition="+c);
		return true;
		
	}
	public boolean my()
	{
		return true;
	}
	
}

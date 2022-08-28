package student;

public class New {
	int a=99;
	char c='b';
	public void m1()//without arument without return type
	{
		System.out.println("this is non static method");
	}
	public void m2(int a,String b)//without return type and with argument
	{
		System.out.println("value of aa=="+a);
		System.out.println("value of b=="+b);
	}
	public int me()//with return type without argument
	{
		return a;
		
	}
	public char mt(int a, int b)//with return type with argument
	{
		
		int d=a+b;
		System.out.println("addition="+d);
		return c;
	}
	
	
	
	public static void main(String args[])
	{
		New obj=new New();
	obj.m1();
	obj.m2(45,"Sid");
	 //int z=obj.me();
	 System.out.println("value of z=="+obj.me());
	 obj.mt(90,80);	 
	 
	}

}

package inheritance;

public class Child extends Parent{
	int temp=90;
	public void t1()
	{
		System.out.println("temp=="+temp);
		System.out.println("parent class temp=="+super.temp);
	}
	
	public void ad()
	{int c=temp+s;
	System.out.println("Addition of parent class="+c);
		
	}
	public static void main(String args[])
	{
		Child c=new Child();
		c.add();
		//System.out.println("child class variable=="+c.temp);
		c.t1();
c.ad();
}
}

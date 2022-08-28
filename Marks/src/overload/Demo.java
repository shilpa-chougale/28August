package overload;

public class Demo {

	int a=90;
	int b=70;
	public void add()
	{
		Demo obj=new Demo();
		System.out.println("a=="+obj.a );
		System.out.println("B=="+obj.b );
		
	}
	public void add(int c)
	{Demo obj=new Demo();
	System.out.println("C=="+c );
	System.out.println("Addition=="+(obj.a+obj.b));
	
		
	}
	public void add(String args)
	{
		System.out.println("Name=="+args );
		
	}
	
	public static void main(String args[])
	{
		Demo obj=new Demo();
		obj.add();
		obj.add(66);
		obj.add("shilpa");
	}
	
}

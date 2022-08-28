package constru_inheritance;

public class Demo2 extends Demo1 {
	public Demo2()
	{
		super(19);
		System.out.println("Demo2 Constructor");
	}
	public Demo2(int i)
	{ 
		this();
		System.out.println("Demo2 Constructor with args="+i);
	}
	public static void main(String args[])
	{
		new Demo2(20);
	}

}

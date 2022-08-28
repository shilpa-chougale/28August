package overload;

public class Child extends Demo{
	public void add(String args,int a)
	{
		System.out.println("Name=="+ args);
		System.out.println("A=="+a );
	}
	public static void main(String args[])
	{
		Child obj=new Child();
		obj.add("Ansh", 990);
		obj.add(50);
		
	}

}

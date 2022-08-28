package override;

public class Child extends Parent{
	public void add()
	{
		System.out.println("add method in Child");
	}
public static void main(String[] args) {
	
	Child obj=new Child();
	obj.add();
		
}
}

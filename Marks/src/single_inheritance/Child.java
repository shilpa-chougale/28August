package single_inheritance;

public class Child extends Parent {
public static void main(String args[])

{
	
	Child c=new Child();
	System.out.println("A variable of parent class=="+c.a);
	System.out.println("B variable of parent class=="+c.b);
	c.add();
	c.sub();
	m1();
	
	
}
}

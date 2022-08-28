package polymorphim;

public class Child extends Parent {
public void m1(boolean c)
{
	System.out.println("child m1");
}
public static void main(String args[])
{
  Child obj=new Child();
  obj.m1();
  obj.m1(false);
	
	

}
}

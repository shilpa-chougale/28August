package multilevel_Inheritance;

public class Grand_Parent {
	int a=77;
	static int b=44;
	public static void m1()
	{ int a=50;
	int b=40;
		System.out.println("Parent class Static method");
		Grand_Parent gp=new Grand_Parent();
		System.out.println("Global Variable A="+gp.a);
		System.out.println("Global Variable b="+Grand_Parent.b);
		System.out.println("Local Variable a="+a);
		System.out.println("Local Variable b="+b);
		System.out.println();
	}
	public void m2()
	{int a=33;
	int b=55;

		System.out.println("Parent class Non Static method");
		System.out.println("Local Variable a="+a);
		System.out.println("Local Variable b="+b);
		System.out.println("Global Variable A="+this.a);
		System.out.println("Global Variable b="+Grand_Parent.b);
		System.out.println();
	}
	
}

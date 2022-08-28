package student;

public class Marks {
int maths=80;
int physics=90;
int chemistry=95;
public void m1()
{
	maths=30;
	physics=40;
	chemistry=50;
	System.out.println("Marks 0f Maths subject="+maths);
	System.out.println("Marks 0f chemistry subject="+chemistry);
	System.out.println("Marks 0f Maths physics="+physics);
}
public void m2()
{
	maths=55;
	physics=44;
	chemistry=66;
	System.out.println("Marks 0f Maths subject="+maths);
	System.out.println("Marks 0f chemistry subject="+chemistry);
	System.out.println("Marks 0f Maths physics="+physics);
	
}
public static void main(String args[])
{
	Marks Avadhut= new Marks();
	System.out.println("Marks 0f Avadhoot=");
	Avadhut.m1();
	System.out.println();
	
	Marks Seema= new Marks();
	System.out.println("Marks 0f Seema=");
	System.out.println("Marks 0f Maths subject="+Seema.maths);
	System.out.println("Marks 0f physics subject="+Seema.physics);
	System.out.println("Marks 0f chemistry subject="+Seema.chemistry);
	System.out.println();
	
	Marks Raju= new Marks();
	System.out.println("Marks 0f Raju=");
	Raju.m2();
	
}
}

package student;

import java.util.Scanner;

public class Test {

	
	public void me()
	{ 
    int maths;
	int ph;
	int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter marks of maths=\t");
		maths=sc.nextInt();
		System.out.println(" enter marks of physics=\t");
		ph=sc.nextInt();
		System.out.println(" enter marks of chemistry=\t");
		ch=sc.nextInt();
		
		System.out.println("marks of maths="+maths);
		System.out.println("marks of chemistry="+ch);
		System.out.println("marks of physics="+ph);
		System.out.println();
	}
	public static void main(String args[])
	{
		Test Avadhut =new Test();
		System.out.println("Marks of Avadhut=");
		Avadhut.me();
		Test Seema =new Test();
		System.out.println("Marks of Seema=");
		Seema.me();
		Test Raju =new Test();
		System.out.println("Marks of Raju=");
		Raju.me();
		
		
	}
}

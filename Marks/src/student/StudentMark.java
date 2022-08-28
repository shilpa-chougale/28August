package student;

public class StudentMark {
	public int m1(int sci,int phy,int che,String studname)
	{
		System.out.println("Student Name=="+studname);
		System.out.println("Science marks="+sci+"\tPhysics="+phy+"\tChemistry="+che);
		int total=sci+che+phy;
		System.out.println("Total="+total);
		return total;
	}
public static void main(String args[])
{
	StudentMark stud=new StudentMark();
	stud.m1(89,88,67,"Shilpa");
	
	stud.m1(77,84,44,"Sush");
	stud.m1(66,80,33,"Kanchan");
	stud.m1(55,60,77,"Sid");
	
}
}

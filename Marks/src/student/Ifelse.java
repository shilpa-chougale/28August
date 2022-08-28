package student;

public class Ifelse 
{
	int maths;
	int phy;
	int che;
	
	Ifelse(int maths,int phy,int che,String studname)
	{
		this.maths=maths;
		this.phy=phy;
		this.che=che;
		
		System.out.println("Student name=="+studname);
		System.out.println("Marks of maths=="+maths);
		System.out.println("marks of Physics="+phy);
		System.out.println("Marks of Chemistry="+che);
		System.out.println("Result is="+per()+"%\n");
	}
	public float per() {
		int total=maths+che+phy;
		System.out.println("total=="+total);
		float percent=total/3;
		if(percent>35&&maths>=35&&phy>=35&&che>=35)
		System.out.println("you are pass");
		else 
			System.out.println("You are fail");
		return percent;	
	}
	public static void main(String args[])
	{
		 new Ifelse(35,44,55,"seema");
		 new Ifelse(55,30,77,"Raju");
	}

}

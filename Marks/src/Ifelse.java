
public class Ifelse {
	
	int che;
	int phy;
	int maths;
	Ifelse(int che,int phy,int maths,String stud)
	{
		this.che=che;
		this.phy=phy;
		this.maths=maths;
		
		System.out.println("Student  name="+stud);
		System.out.println("Student  chemistry="+che);
		System.out.println("Student  phy="+phy);
		System.out.println("Student  maths="+maths);
		System.out.println("Student  name="+stud+"\t Average marks="+total());
		if(total()>50)
		{
	       System.out.println(stud+" is pass");	
		}
		else
			System.out.println(stud+" is Fail");
		System.out.println();
		
	}
	public float total()
	{
		float t=(che+maths+phy)/3;
		return t;
		
	}
	public static void main(String args[])
	{
		new Ifelse(99,80,70,"Shilpa");
		new Ifelse(45,33,70,"Ansh");
		
	}

}

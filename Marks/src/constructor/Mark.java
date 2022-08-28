package constructor;

public class Mark {
	int sci,phy,che;
	public Mark(int sci,int phy,int che,String stud)
	{
		this.sci=sci;
		this.phy=phy;
		this.che=che;
		System.out.println("Student name="+stud);
		System.out.println("Student Scence marks="+sci);
		System.out.println("Student Physics="+phy);
		System.out.println("Student Cemistry="+che);
		//System.out.println("Toatl="+(sci+phy+che));
		
		System.out.println("Total=="+total());
		System.out.println();
	}
	public Mark(String stud,int sci,int phy,int che)
	{
		
		this(77,99,88,"Shilpa");
		this.sci=sci;
		this.phy=phy;
		this.che=che;
		System.out.println("Student name="+stud);
		System.out.println("Student Scence marks="+sci);
		System.out.println("Student Physics="+phy);
		System.out.println("Student Cemistry="+che);
		//System.out.println("Toatl="+(sci+phy+che));
		
		System.out.println("Total percent=="+total());
		System.out.println();
	}
	public Mark(int sci,String stud,int phy,int che)
	{
		this("Sid",78,99,86);
		this.sci=sci;
		this.phy=phy;
		this.che=che;
		System.out.println("Student name="+stud);
		System.out.println("Student Scence marks="+sci);
		System.out.println("Student Physics="+phy);
		System.out.println("Student Cemistry="+che);
		//System.out.println("Toatl="+(sci+phy+che));
		
		System.out.println("Total=="+total());
		System.out.println();
	}
	public float total()
	{
		int total=(this.sci+this.phy+this.che)/3;
		return total;
		
		
	}
	public static void main(String args[])
	{
	new Mark(50,"Ansh",60,70);
	}

}

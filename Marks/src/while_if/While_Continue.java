package while_if;

public class While_Continue {
public static void main(String args[])
{
	System.out.println("even no.using while loop");
	
	int i=1;
	while(i<50)
	{
		i++;
		if(i==34)
			continue;
		
		if(i%2==0)
		System.out.print(" "+i);
		}
	System.out.println("\n\neven no.using for loop");
	for(int j=1;j<=45;j++)
	{
		if(j==42)
			continue;
		if(j%2==1)
			System.out.print(j+" ");
	}
}
}

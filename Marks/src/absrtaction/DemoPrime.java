package absrtaction;

public abstract class DemoPrime extends Demo {

	@Override
	public void prime() {
		System.out.println("\nprime no upto 50");
		for(int num=2;num<=50;num++)
		{
		int a=0;
		
		for(int i=2;i<=(num-1);i++)
		{
			if(num%i==0)
			{
			a++;
			}
		}
		if(a==0)
			System.out.println(num+" ");
		}
		
	}

	@Override
	abstract void fibo() ;

}

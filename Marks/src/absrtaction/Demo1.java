package absrtaction;

abstract class Demo {
	
	public void fact()
	{
		int fact=1;
		int num=4;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
System.out.println("factorial=="+fact);
	}
	abstract void prime();
	
	abstract void fibo();
	public void reverse()
	{System.out.println("\nreverse no program");
		int reverse=0;
		int num=78965;
		System.out.println("number=="+num);
		while(num>0) {
			int rem=num%10;
			num=num/10;
			reverse=reverse*10+rem;
			}
		System.out.println("reverse no=="+reverse);
	}
	

}

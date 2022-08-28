package absrtaction;

public class DemoFibo  extends Demo{

	@Override
	void fibo() {
		// TODO Auto-generated method stub
		
		System.out.println("\nfibonacci series:");
		int no1=0;
		int no2=1;
		
		System.out.print(no1+","+no2);
		for(int i=1;i<=50;no2=i)
		{
			i=no1+no2;
			if(i>=50)
				break;
			no1=no2;
			System.out.print(","+i);
		}
		System.out.println();
	}

	@Override
	void prime() {
		// TODO Auto-generated method stub
		
	}

}

/*class Main2
{
	public void dis(int n)
	{
		for(int i=1;i<=n;i++)
		{
			
			if(i==5)
			{
				continue;
			}System.out.print(i);
		}
	}
}
public class Main1
{
	public static void main(String args[])
	{
     Main2 m=new Main2();
	 m.dis(10);
	}
}*/
class PrimeFactors
{
	public void dis(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print("Factor of 6 is"+i);
	    for (int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				System.out.print("Prime factors:"+j);
			}
		}
		}
	}
}
public class Main1{
	public static void main(String args[])
	{
		PrimeFactors pf=new PrimeFactors();
	    pf.dis(6);
	}
}
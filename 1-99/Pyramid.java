class Pattern
{
	public void show(int n)
	{
		for(int j=0;j<n;j++)
		{
			for (int i=0;i<=j;i++)
			{	    
			System.out.print("*    ");				
			}
			System.out.println();
		}
	}
}
class Pyramid
{
	 public static void main(String args[])
	 {
		  Pattern p=new Pattern();
		  p.show(5);
	 }
}

/*class Odd
{
	public void dis(int n)
	{
		for (int j=1;j<=n;j++)
		{
			for (int i=1;i<=j*2-1;i+=2)
			{
			
					System.out.print(i+"");
			}System.out.println();
		}
	}
}
public class Pyramid{
	public static void main(String args[])
	{
		Odd o= new Odd();
		o.dis(5);
	}
}*/
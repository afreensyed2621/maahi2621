/*class Pattern1
{
    public void dis(int n)
    {
	    for(int j=1;j<=n;j++)
	    {
	        for (int k=n-1;k>=j;k--)
	        {
	        System.out.print(" ");
		    }  
		        for(int i=1;i<=j;i++)
		        {
                System.out.print("* ");
			    }
			 System.out.println();
	 }	 
	}
}
public class Main5
{   
    public static void main(String args[])
	{
	Pattern1 p=new Pattern1();
	p.dis(5);
	}
}*/
/*class Pattern
{
	public void dis(int n)
	{
		int spaces=n/2;
		int stars=1;
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*"); 
            }

            if (i <= n / 2) {
                spaces--; 
                stars += 2; 
            } else {
                spaces++; 
                stars -= 2; 
            }

            System.out.println(); 
        }
    }
}
public class Main5
{
	public static void main(String args[])
	{
		Pattern p=new Pattern();
		p.dis(9);
	}
}*/
class Pattern
{
	public void dis(int n)
	{
		
		for(int j=1;j<=n;j++)
		{
			int a=1;
			for(int i=1;i<=j;i++)
			{
				System.out.print(a%2);
				a++;
			}
			System.out.println();
		}
	}
}
public class Main5
{
	public static void main(String args[])
	{
		Pattern p=new Pattern();
		p.dis(5);
	}
}
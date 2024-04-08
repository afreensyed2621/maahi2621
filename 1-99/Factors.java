class Number
{
	public void disp(int n)
	{
	 for(int i=1;i<=n;i++)
	    {
		if(n%i==0)
		   System.out.println(i);
		
		}
	 }
}
public class Factors
{
    public static void main(String args[])
	{
		Number n1=new Number();
		n1.disp(10);
	}
}
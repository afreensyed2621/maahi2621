class Number
{
	public void disp(int n)
	{
        int count=0;
		for(int i=1;i<=n;i++)
		{
	
		 System.out.println(i*2);
		}
	}
}
public class Even 
{
	public static void main(String[] args) 
	{
		Number n1=new Number();
		n1.disp(10);
	}
}
        
/*class Number
{
	public void disp(int n)
	{
    int count=0;
	   for(int i=1;i<=n;i++)
	   {
	      if(n%i==0)
    	  count++;
	   }
	   if(count==2)
	      System.out.println("The given "+n+"is prime number");
		else 
		   System.out.println("The given "+n+"is not a prime number");
	}
}
public class Prime
{
    public static void main(String args[])
	{
     Number n1=new Number();
	 n1.disp(23);
	}																													
}*/

  class Number
  {
	  public void disp(int n)
	  {
       int sum =0;  
        while(n!= 0)   
        {  
        int digit=n%10;  
         sum=sum+digit;
         n = n/10;  
        }  
         System.out.println("The sum of the given number is: " + sum);
    }  
}  
public class Prime 
{  
    public static void main(String[] args)   
    {  
	Number n1=new Number();
	n1.disp(123456789);
	}
}
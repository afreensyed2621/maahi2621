class Pattern1
{
  int i=1,j;
      public void dis( int n)
   	    {
	    for(j=1;j<=n;j++)
	       {
			   int a=j;
	       for(i=1;i<=j;i++)
		   {
			  System.out.print(a+"");
			  a=n-j;
			  a--;
			}
			  System.out.println();
		   }
         }
}
public class Main2
{
   public static void main(String args[])
   {
      Pattern1 p=new Pattern1();
	  p.dis(5);
	}
}
class Calculation
{
   int a;
   int b;
	public void display()
	{
		int c = a+b;
	    System.out.println(c);
	}
}
 public class Syed
{
    public static void main(String args[])
	{
	 Calculation d = new Calculation();
	
	 d.a=21;
	 d.b=26;
	   d.display();
	 d.a=2000;
	 d.b=3000;
	   d.display();
	 System.out.println(d.a);
	 System.out.println(d.b);
	 }
}
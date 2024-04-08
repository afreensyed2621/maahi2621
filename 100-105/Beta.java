class Alpha
{
     int a = 93;

	 public void show()
	 {
	 System.out.println(a);
	 }
	 
	 	 String b = "Hello";
	      public void display()
          {
			  System.out.println(b);
		  }
}
public class Beta
{
 public static void main(String args[])
   {
    Alpha alpha=new Alpha();
	alpha.show();
	alpha.display();
	alpha.a=2000;
	System.out.println(alpha.a);
	System.out.println(alpha.b);
	}
}
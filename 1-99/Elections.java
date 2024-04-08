class Casting
{
 int a=18;
 public void show()
 {
  if(a>=18)
  System.out.println("Hurry!!! you are Eligible for VOTE");
  else 
  System.out.println("Oops!!! you are Not Eligible for VOTE");
 }
}
 public class Elections
 {
     public static void main(String args[])
	 {
	 Casting cs=new Casting();
	 cs.show();
	 }
 }
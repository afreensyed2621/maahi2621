class Task
{
  public int dis(int a,int b, int c)
  {
  if(a>b&&a>c)
  
  return a;
  
      else if(b>c)
	     
		 return b;
		 
		     else 
			 return c;
   }
}
class Marks
{
    public static void main(String args[])
      {
       Task t=new Task();
       int x=t.dis(93,87,92);
       System.out.println(x);
      }
}	  
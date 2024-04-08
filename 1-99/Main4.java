class Pattern3
{	
   
   public void dis(int n)
	{ char a='A';
	   for(int j=0;j<=n;j++)
	   {    
          for(int k=n-1;k>j;k--)
		  {
			  System.out.print("");
		  }
		  
	       for(int i=0;i<=j;i++)
		   {
		   System.out.print((char)(a+i)+" ");
		   a++;
		   } 
		   System.out.println();
        }
	}
}
  	
class Main4
{

    public static void main(String args[])
	{
	 Pattern3 p=new Pattern3();
	 p.dis(5);
	}
}


    

/*class Pattern
{
	public void show()
	{
		for(int j=1;j<=5;j++)
		{
			char n='c';
			for (int i=1;i<=j;i++)
			{
				 System.out.print(n);
				 n++;
			}
			System.out.println(" ");
		}
	}
}
class Main4
{
	 public static void main(String args[])
	 {
		  Pattern p=new Pattern();
		  p.show();
	 }
}
*/



/*class Pattern
{
	public void show(int n)
	{
		for(int j=1;j<=n;j++)
		{
			for (int i=1;i<=j;i++)
			{
				 System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
class Main4
{
	 public static void main(String args[])
	 {
		  Pattern p=new Pattern();
		  p.show(5);
	 }
}*/


/*
class Pattern3
{
 
    public void dis(int n,int m)
	{ 
	   for(int j=1;j<=n;j++)
	   {    
	       for(int i=1;i<=m;i++)
		   {
		    System.out.print(i);
			
		   }System.out.println("");
        }
	}
}
	
class Main4
{
    public static void main(String args[])
	{
	 Pattern3 p=new Pattern3();
	 p.dis(5,5);
	}
}
*/
/*class Pattern 
{
	public void dis(int n)
	{ 
	    for(int j=1;j<n;j++)
		{ 
	      
	         for(int i=0;i<n;i++)
			 {
			    if((i%2==0 && j%2==0)||(i%2==1&& j%2==1))
                  System.out.print("1");
                  else
                    System.out.print("0");
			 }System.out.println();
        }
    }
}
public class Main4
{ 
   public static void main(String args[])
   { 
    Pattern p=new Pattern();
     p.dis(5);
   }
}*/
/*
class Pattern3
{	
   int n=5;
   public void dis(int a)
	{ 
	   for(int j=0;j<=n;j++)
	   {    
	       for(int i=0;i<=j;i++)
		   {
		    System.out.print(a+" ");
			a++;
		   }System.out.println("\n");
        }
	}
}
  	
class Main4
{

    public static void main(String args[])
	{
	 Pattern3 p=new Pattern3();
	 p.dis(1);
	}
}*/

/*class  Pattern
{
	public void dis(char ch)
	{ 
		for(int j=1;j<=5;j++)
		{
	ch='A';	   
			for(int i=1;i<=j;i++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
				 
				 
 public class Main4
 { 
public static void main(String arg[]){
	Pattern p=new Pattern();
	p.dis('a');
}
 }*/
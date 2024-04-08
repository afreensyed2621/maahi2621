class Pattern2
{
     int i,j;
	 public void show(int n,int m)
	 {
	      for(j=1; j<=n;j++)
		  { 
		   for(i=1;i<=m;i++)
		     {
			   System.out.println(j+" "+i);
			  }
		  }
     }
}
public class Main3
{    
    public static void main(String args[])
	 {
	 Pattern2 p=new Pattern2();
	 p.show(3,3);
	}
}
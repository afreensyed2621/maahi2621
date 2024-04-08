import java.lang.*;
class First1
{
	
	public void display(byte a,short b,long c,int d,float e,double f,char g,boolean h)
	{
		System.out.println(a,b,c,d,e,f,g,h);
	}
}
public class Second
{
	 public static void main(String args[])
	{
		First1 fr=new First1();
		fr.display();
	}    
     
}
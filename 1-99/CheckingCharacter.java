/*class Alphabet
{  
    public void dis(char n)
	{
	if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
	  {
	  System.out.println(n+" - Given Character is a Vowel");
	  }
	     else
		  System.out.println(n+ " - Given Character is a Consonant");
	 }
}
public class CheckingCharacter	 
{ 
    public static void main(String args[])
	{ 
	    Alphabet a=new Alphabet();
		a.dis('a');
	}
}*/
/*class Integer
{
	public void dis(int n)
	{
		if(n>0)
		{
			System.out.println(n+" - The given number is POSITIVE");
		}
		     else if(n<0)
			 { 
		        System.out.println(n+" - The given number is NEGATIVE");
			 }
			     else
					 System.out.println(n+" - The given number is ZERO");
	}
}
public class CheckingCharacter
{
	public static void main(String args[])
	{
		Integer i=new Integer();
		i.dis(-7675);
	}
}*/
/*class LeapYear
{
	public void dis(int n)
	{
		if((n%4==0&&n%100!=0)||(n%400==0)) 
		{
			System.out.println(n+" - The given year is leap year");
		}
			 else
				 System.out.println(n+" - The given year is not leap year");
	}
}
public class CheckingCharacter
{ 
    public static void main(String args[])
	{
		LeapYear ly=new LeapYear();
		ly.dis(2014);
	}
}*/

/*class Find
{
	public int dis(int a,int b,int c)
	{
if ((a >= b && a <= c) || (a <= b && a >= c)) {
            return a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            return b;
        } else {
            return c;
        }
    }
 
    
}
public class CheckingCharacter
{
	public static void main(String args[])
		{
			Find f=new Find();
			
         int num=f.dis(53,75,34);
        System.out.println("The second largest number is: "+num);
        }
}*/
/*class Century
{
	public void dis(int n)
	{
		if(n%100==0)
		{
			System.out.println(n+" - The given year is a Century year");
		}
		else 
			System.out.println(n+" - The given year is not a Century year");
	}
}
public class CheckingCharacter
{
	public static void main(String args[])
	{
		Century c=new Century();
		c.dis(2024);
	}
}*/
class Alphabet
{  
    public void dis(char n)
	{
	if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
	  {
	  System.out.println(n+" - Given Character is a Vowel");
	  }
	     else
		  System.out.println(n+ " - Given Character is a Consonant");
	 }
}
public class CheckingCharacter	 
{ 
    public static void main(String args[])
	{ 
	    Alphabet a=new Alphabet();
		a.dis('a');
}
}
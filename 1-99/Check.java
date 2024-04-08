class Number
{
      public String show(int a)
      {
	  if(a<0)
       return "Invalid Number";
          
              else if(a%2==0)
             
	          return "Even Number";
	         
	            else 
		        return "Odd Number";
       }
}
class Check
{
     public static void main(String args[])
     {
		 Number n=new Number();
		 String A=n.show(23);
		 System.out.println(A);
	 }
}
		  
      
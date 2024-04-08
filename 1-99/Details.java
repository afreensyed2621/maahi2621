class Employee
{
	  int id;
      String name;
      float salary;
   
      public void display()
	  {
		  
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(salary);
	  }
}
public class Details
{  
  public static void main(String args[])
    {
     Employee e= new Employee();
     e.id = 123456;
     e.name = "Afreen Syed";
     e.salary = 30000;
     e.display();
	 
     }
 }
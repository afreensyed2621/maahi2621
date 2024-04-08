class Circle
{
    public int sq(int a )
    {
    return (a*a);
    }
      public float show(float b)
      {
		  float e=3.14*sq(b);
          return e;
      }
}
public class Area
{
  public static void main(String args[])
  {
    Circle c=new Circle();
    int x=c.display(6);
    int y=c.show(6);
    System.out.println(x);
    System.out.println(y);
  }
}


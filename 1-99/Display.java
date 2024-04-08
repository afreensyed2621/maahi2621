class DataTypes
{
   public void all(byte b, short s, long l, int i, float f, double d, char c , boolean bool )
   {
   System.out.println( b +"\n"+ s +"\n"+ i +"\n" + l + f +"\n"+ d +"\n" + c +"\n"+ bool);
   }
   }
  public class Display
  {
  public static void main(String args[])
  {
  DataTypes dt=new DataTypes();
  dt.all((byte) 10, (short) 20, 30L, 40, 50.5f, 60.5, 'A', true);
  }
  }
  
class Tab
{
	int i;
	public void show()
	{
	  while(i<=1000000)
	  {
	  System.out.println(i);
	  i=i*10;
	  
	  }
	}
}
class Table2
{
	public static void main(String args[])
	{
	Tab t=new Tab();
	t.i=1;
	t.show();
	}
}

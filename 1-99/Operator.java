class Arthimetic
{
    public static int sum(int a, int b,int c ,int d){
	return a+b+c+d;
	}
	public static int sub(int e, int f, int g, int h){
	return  e-f-g-h;
	}
	public static int mul(int i, int j,int k,int l){
	return i*j*k*l;
	}
	public static int div(int m, int n, int o, int p){
	return m/n/o/p;
	}
}

    public class Operation
	 {
       public static void main(String args[])
     {
       System.out.println(Arthimetic.div(Arthimetic.mul(Arthimetic.sub(Arthimetic.sum(34,67,93,85),21,34,42),65,59,93),45,75,75));
	  }
	 }
 
package Pack2;

public class Fibonacci {
	public void Number(int a)
	{
		int f1=0,f2=1,f3;
		for(int i=1;i<=a;i++)
		{
			f3=f1+f2;
			f1=f2;
			System.out.print(f2+" ");
			f2=f3;
		}
		
		}
	public static void main(String[] args) {
		Fibonacci obj=new Fibonacci();
		obj.Number(10);
	}

}

package Com.pack2;

public class Test {
	public void meth()
	{
		int n=5;
		int px=n,py=n;
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
				if(s==px|| s==py)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
		}
		px--;
		py++;
		System.out.print("\n");
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.meth();
	}

}

package Com.pack2;
import java.util.Scanner;
public class Test2 {
	public void meth(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			count=count+i;
		}
		System.out.println(count);
	}
	public void meth2(int a,int b)
	{
		System.out.println(a*b);
	}
	public void meth3()
	{
		for(int i=9;i<=180;i=i+9)
		{
			System.out.print(i+" ");
		}
	}
	public void meth4()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Test2 obj=new Test2();
		System.out.println("Enter input");
		obj.meth(sc.nextInt());
		obj.meth2(sc.nextInt(),sc.nextInt());
		obj.meth3();
		obj.meth4();
		sc.close();
	}

}

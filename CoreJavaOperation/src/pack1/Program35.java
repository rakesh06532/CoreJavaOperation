package pack1;

import java.util.Scanner;

public class Program35 {
	public int method(int a)
	{
		int f1=0,f2=1,f3,sum=0,i,fact;
		for(i=1;i<=a;i++)
		{
			f3=f1+f2;f1=f2;f2=f3;
			fact=1;
		while(a>0)
		{
			fact=fact*a;
			
			//System.out.print(fact+" ");
			a--;
		}
		sum=sum+fact;
		}
		return sum;
	}
	public static void main(String []args)
	{
		Scanner abc=new Scanner(System.in);
		Program35 ab=new Program35();
		System.out.println("Enter the number");
		int a=abc.nextInt();
		int result=ab.method(a);
		System.out.println(result);
		abc.close();
	}

}

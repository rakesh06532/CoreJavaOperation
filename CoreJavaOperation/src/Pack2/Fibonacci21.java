package Pack2;

import java.util.Scanner;

public class Fibonacci21 {
	public int Fib(int a)
	{
		int f1=1,f2=2,f3,value=0;
		for(int i=1;i<=a;i++)
		{
			
			f3=f1+f2;
			f1=f2;
			value=value+f2;
			System.out.println(f2);
			f2=f3;
		}
		return value;
	}
	public static void main(String[] args) {
		Fibonacci21 obj=new Fibonacci21();
		Scanner sc=new Scanner(System.in);
		System.out.println("How much do you want to fibonacci no");
		int a=sc.nextInt();
		int result=obj.Fib(a);
		System.out.println("The sum of Fibonacci no is : "+result);
		sc.close();
	}

}

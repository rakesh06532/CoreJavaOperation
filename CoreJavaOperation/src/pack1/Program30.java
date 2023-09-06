package pack1;

import java.util.Scanner;

public class Program30 {
	
	public int method(int a)
	{
		int i,sum=0;
		for(i=1;i<=a;i++)
		{
			if(i%3==0||i%5==0)sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program30 ab=new Program30();
		System.out.println("Enter the number");
		int a=abc.nextInt();                             abc.close();
		int result=ab.method(a);
		System.out.println(result);
	}

}

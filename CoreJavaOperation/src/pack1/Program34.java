package pack1;

import java.util.Scanner;

public class Program34 {
	int cube;
	public int method(int a)
	{
		int r,sum=0;
		while(a!=0)
		{
		r=a%10; cube=r*r*r;sum=sum+cube;a=a/10;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program34 ab=new Program34();
		System.out.println("Enter the number");
		int a=abc.nextInt();                             abc.close();
		int result=ab.method(a);
		System.out.println(result);
	}

}

package pack1;

import java.util.Scanner;

public class Program13 {
	public String method(int a,int b)
	{
		int i;String st="";
		if(a<0||b<=0)return "-1";
		else if(a==b)return "-2";
		else if(a>b)return "-3";
		else
		{
			for(i=a+1;i<b;i++)
			{
				st=st+i+" ";
			}
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=abc.nextInt();
		System.out.println("Enter second number");
		int b=abc.nextInt();
		Program13 ab=new Program13();
		System.out.println(ab.method(a, b));
		abc.close();
	}

}

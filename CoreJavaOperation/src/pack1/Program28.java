package pack1;

import java.util.Scanner;

public class Program28 {
	public String method(int a,int b)
	{
		String st="";int i,count,j;
		if(a<0||b<0)st="-1";
		else if(a>=b)st="-2";
		else {
			for(i=a;i<=b;i++)
			{
				for(count=0,j=1;j<=b;j++)
				if(i%j==0)count++;
				if(count==2)st=st+i+" ";
			}
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program28 ab=new Program28();
		System.out.println("Enter first number to check prime no");
		int a=abc.nextInt();
		System.out.println("Enter second number");
		int b=abc.nextInt();                                      abc.close();
		String result=ab.method(a, b);
		System.out.println(result);
	}

}

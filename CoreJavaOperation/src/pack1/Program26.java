package pack1;

import java.util.Scanner;

public class Program26 {
	public String method(int a,int b)
	{
		String st="";int i;
		if(a<0||b<0)st="-1";
		else if(a==0||b==0)st="-2";
		else if(a==b)st="-2";
		else {
			for(i=a;i<=b;i++)
			{
			if(i%2==0)st=st+i+" ";
			}
			for(i=b;i<=a;i++)
			{
			if(i%2==0)st=st+i+" ";
			}		
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program26 ab=new Program26();
		System.out.println("Enter first number");
		int a=abc.nextInt();
		System.out.println("Enter second number");
		int b=abc.nextInt();                           abc.close();
		String result=ab.method(a, b);
		System.out.println(result);
	}

}

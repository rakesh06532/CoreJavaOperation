package pack1;

import java.util.Scanner;

public class Program27 {
	public String method(int a,int b,int c)
	{
		String st="";
		if(a==0||b==0||c==0)st="-1";
		else if(a<0||b<0||c<0)st="-2";
		else if(a+b<c||b+c<a||c+a<b)st="-3";
		else if(a==b && b==c && c==a)st="Equilateral";
		else if(a==b || b==c || c==a)st="Isosceles";
		else st="Scalene";
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program27 ab=new Program27();
		System.out.println("Enter first angle");
		int a=abc.nextInt();
		System.out.println("Enter second angle");
		int b=abc.nextInt();
		System.out.println("Enter third angle");
		int c=abc.nextInt();                                  abc.close();
		String result=ab.method(a, b, c);
		System.out.println(result);
		
	}

}

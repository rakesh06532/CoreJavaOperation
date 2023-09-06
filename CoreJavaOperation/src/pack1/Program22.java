package pack1;

import java.util.Scanner;

public class Program22 {
	String st="";int r,sum=0,c;
	
	public String method(int a)
	{
		int b=a;
		if(a<0)st="-1";
		else if(a<100)st="-2";
		else {
			while(a>0)
			{
			r=a%10;c=r*r*r;sum=sum+c; a=a/10;//(int)math.power(r,r);
			{
			if(b==sum)st="Armstrong no";
			else st="Not armstrong no";
		}
		
			}
	}
			return st;
		}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program22 ab=new Program22();
		System.out.println("Enter the number");
		int a=abc.nextInt();                                abc.close();
		String result=ab.method(a);
		System.out.println(result);
	}

}

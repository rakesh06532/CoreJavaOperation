package pack1;

import java.util.Scanner;

public class Program24 {
	public String method(int a)
	{int i;
		String st="";
		if(a<0)st="-1";
		else if(a==0)st="-2";
		else {
			for( i=1;i<=a;i++)
			{
			if(a%i==0)
			st=st+i+" ";
			}
		}
		//System.out.println(st);
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program24 ab=new Program24();
		System.out.println("Enter the number");
		int a=abc.nextInt();                             abc.close();
		String result=ab.method(a);
		System.out.println(result); 
	}

}

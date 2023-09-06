package pack1;

import java.util.Scanner;

public class Program40 {
	boolean st;
	public boolean method(int a)
	{
		int rem,rev=0,b=a;
		while(b!=0)
		{
			rem=b%10;rev=rev*10+rem;b=b/10;
			if(a==rev)st=true;
			else st=false;
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=abc.nextInt();
		Program40 ab=new Program40();
		System.out.println(ab.method(a));
		abc.close();
	}

}

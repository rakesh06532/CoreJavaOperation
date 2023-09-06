package pack1;

import java.util.Scanner;

public class Program45 {
	public boolean adamnumber(int a)
	{
		int x,y,z;
		Program45 ab=new Program45();
		x=ab.getreverse(a);
		y=getSquare(a);
		//y=a*a;z=x*x;
		z=getSquare(x);
		if(ab.getreverse(y)==z)return true;
		else return false;
	}
	int getSquare(int d)
	{
		return d*d;
	}
	public int getreverse(int a)
	{
		int rem,rev=0;
		while(a!=0)
		{
		rem=a%10; rev=rev*10+rem;a=a/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=abc.nextInt();
		Program45 ab=new Program45();
		System.out.println(ab.adamnumber(a));
		abc.close();	
	}

}

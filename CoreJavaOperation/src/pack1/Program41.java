package pack1;

import java.util.Scanner;

public class Program41 {
	public int method(int a,int b)
	{
		int rem=a,add=b,st=0;
		while(rem!=0)
		{
		if(a<=0||b<=0)st = -1;
		if(rem%2==1 && add%2==0)st=st+add;
		System.out.println("Halving "+rem+"    "+"Doubling "+add);
		rem=rem/2;add=add*2;
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=abc.nextInt();
		System.out.println("Enter second number");
		int b=abc.nextInt();
		Program41 ab=new Program41();
		System.out.println("Product of a and b = " +ab.method(a,b));
		abc.close();
		
	}

}

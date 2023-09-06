package pack1;

import java.util.Scanner;

public class Program44 {
	public int method(int a)
	{
		int count=0,st=0;
		if(a==0)return 1;
		while(a!=0)
		{
			if(a%10==0)count++;st=count;
			a=a/10;
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the number to count the zero");
		int a=abc.nextInt();
		Program44 ab=new Program44();
		System.out.println(ab.method(a));
		abc.close();
	}

}

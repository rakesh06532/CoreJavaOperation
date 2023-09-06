package pack1;

import java.util.Scanner;

public class Program42 {
	public String method(int a)
	{
		String st="";
		while(a!=1)
		{
		if(a<0)return "error";
		if(a%2==1)a=a*3+1;
		st=st+" "+a;
		a=a/2;
		}
		return st+" 1";
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=abc.nextInt();
		Program42 ab=new Program42();
		System.out.println(ab.method(a));
		abc.close();
	}

}

package pack1;

import java.util.Scanner;

public class Program7 {
	public int method(int a)
	{
		if(a<=0)return -1;
		else if(a%2==0)return a*a;
		else return a*a*a;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program7 ab=new Program7();
		System.out.println("Enter the number");
		int a=abc.nextInt();
		int result=ab.method(a);
		System.out.println(result);
		abc.close();
	}

}

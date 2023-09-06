package pack1;

import java.util.Scanner;

public class Program3 {
	public int method(int a, int b)
	{
		if(a<0||b<0)return -1;
		else if(a==0||b==0) return -2;
		else {
			if(a<b)return a;
			else return b;
		}
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program3 ab=new Program3();
		System.out.println("Enter first number");
		int a=abc.nextInt();
		System.out.println("Enter second number");
		int b=abc.nextInt();
		int result=ab.method(a,b);
		System.out.println("Least number is");
		System.out.println(result);
		abc.close();
	}
	}


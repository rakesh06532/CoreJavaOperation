package pack1;

import java.util.Scanner;

public class Program6 {
	public String method(int a)
	{
		if(a<=0)return "Invalid input";
		else if(a%2==0) return "Even";
		else return "Odd";
		
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program6 ab=new Program6();
		System.out.println("Enter the number");
		int a=abc.nextInt();
		String result=ab.method(a);
		System.out.println(result);
		abc.close();
	}

}

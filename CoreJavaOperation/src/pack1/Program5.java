package pack1;

import java.util.Scanner;

public class Program5 {
	public int method(int a)
	{
		if(a>0)return 1;
		else if(a<0)return -1;
		else return 0;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program5 ab=new Program5();
		System.out.println("Enter the number");
		int a=abc.nextInt();
		int result=ab.method(a);
		System.out.println(result);
		abc.close();
	}

}

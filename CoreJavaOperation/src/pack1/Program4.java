package pack1;

import java.util.Scanner;

public class Program4 {
	public int method(int a)
	{
		int b,c;
		if(a<0)return -1;
		else if(a==0)return -2;
		else if(a%2==0)return a;
		else {
			b=a/10;c=(b+1)*10;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program4 ab=new Program4();
		System.out.println("Enter the number");
		int a=abc.nextInt();
		int result=ab.method(a);
		System.out.println(result);
		abc.close();
	}

}

package pack1;

import java.util.Scanner;

public class Program33 {

	public int method(int a)
	{
		int i,sum=0;
		for(i=1;i<=a;i++)
		if(i%3==0 && i%8==0)sum=sum+i;
		return sum;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program33 ab=new Program33();
		System.out.println("Enter the number");
		int a=abc.nextInt();                              abc.close();
		int result=ab.method(a);
		System.out.println(result);
		
	}

}

package pack1;

import java.util.Scanner;

public class Program29 {
	
	public int method(int a,int b)
	{
		int st=0,i,j,count;
		
		if(a<0||b<0)st= -1;
		else if(a==0||b==0)st= -2;
		else {
			for(i=a;i<=b;i++)
			{
				
				for(count=0,j=1;j<=b;j++)
				if(i%j==0)count++;
				if(count==2)st= st+i;
				
			}
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program29 ab=new Program29();
		System.out.println("Enter first number");
		int a=abc.nextInt();
		System.out.println("Enter second number");
		int b=abc.nextInt();                               abc.close();
		int result=ab.method(a, b);
		System.out.println(result);
	}

}

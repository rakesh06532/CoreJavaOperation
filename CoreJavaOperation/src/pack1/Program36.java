package pack1;

import java.util.Scanner;

public class Program36 {
	int i,count,sum=0,c=0,x;
	public int method(int a)
	{
		for(x=2;c<a;x++)
		{
			count =0;
		for(i=1;i<=x;i++)
			if(x%i==0)count++;
		if(count==2)
			{
				c++;
				sum=sum+x;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program36 ab=new Program36();
		System.out.println("Enter the number");
		int a=abc.nextInt();
		int result=ab.method(a);
		System.out.println(result);
		abc.close();
	}

}

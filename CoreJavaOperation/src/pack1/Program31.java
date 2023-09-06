package pack1;

import java.util.Scanner;

public class Program31 {
	int j,k=0,m=0,p,s,i,r=0;
	public int method(int a,int b)
	{
		for(i=1;i<=a;i++)
		{
			j=(int)Math.pow(i,b);
		m=j+m;
		}
		for(i=1;i<=a;i++)
		{
			r=r+i;
		}
			p=(int)Math.pow(r, b);
		s=Math.abs(m-p);
		return s;
				
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program31 ab=new Program31();
		System.out.println("Enter the number");
		int a=abc.nextInt();
		System.out.println("Enter power");
		int b=abc.nextInt();                     abc.close();
		int result=ab.method(a,b);
		System.out.println(result);
	}

}

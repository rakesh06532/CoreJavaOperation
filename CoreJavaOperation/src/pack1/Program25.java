package pack1;

import java.util.Scanner;

public class Program25 {
	public int method(int a)
	{
		int i,st=0;
		if(a<0)st=-1;
		else if(a==0)st=-2;
		else {
			for(i=1;i<=a;i++)
			{
				if(a%i==0)st=st+i;
			}
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program25 ab=new Program25();
		System.out.println("Enter the number");
		int a=abc.nextInt();                          abc.close();
		int result=ab.method(a);
		System.out.println(result);
		
	}

}

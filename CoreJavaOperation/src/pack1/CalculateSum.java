package pack1;

import java.util.Scanner;

public class CalculateSum {
	int st=0;//String x="";
	//static int s=0;
	public int method(int a)
	{
		for(int i=1;i<=a;i++)
		{
			if(i%3==0 || i%5==0)
			{
				//System.out.print(i+" + ");
				st=st+i;
			}
		}
			return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);          
		CalculateSum ab=new CalculateSum();
		System.out.println("Enter the number");
		int a=abc.nextInt();                                abc.close();
		//ab.method(a);
		int result=ab.method(a);
		//System.out.println(result);
		
		System.out.println(" = "+ result);
		
	}
}

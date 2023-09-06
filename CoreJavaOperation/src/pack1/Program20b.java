package pack1;

import java.util.Scanner;

public class Program20b {
	public String method(int a)
	{
		int i,count; String st="";
		if(a<0)st="-1";
		else if(a==0||a==1)st="-2";
		else {
			for(i=1,count=0;i<=a;i++)
			{
				if(a%i==0)count++;
				{
					if(count==2)st="true";
					else st="false";
				}
				
			}
		}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program20b ab=new Program20b();
		System.out.println("Enter the number");
		int a=abc.nextInt();                             abc.close();
		String result=ab.method(a);
		System.out.println(result);
		
	}

}

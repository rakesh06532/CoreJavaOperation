package pack1;

import java.util.Scanner;

public class Program43 {
	int b=1;//4
	public String method(int a)
	{
		String sum=" ";
		int count=1,c=2;
		if(a<=0)return "";
		while(count<=a)
		{
			sum=sum+b+" ";
			b=b++ + c++ ;
			//System.out.println(b+" ");
			count++;
			//System.out.,(sum+" ");
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=abc.nextInt();
		Program43 ab=new Program43();
		System.out.println(ab.method(a));
		abc.close();
	}

}

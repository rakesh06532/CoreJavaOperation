package pack1;

import java.util.Scanner;

public class Program8 {
	public int method(int [] a)
	{
		int i,sum=0;
		for(i=0;i<3;i++)
		{
		if(a[i]<=0)return -1;
		else a[i]=(a[i]/10+1)*10;
		sum=sum+a[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int i;
		int a[]=new int [3];
		Scanner sc=new Scanner(System.in);
		Program8 ab=new Program8();
		System.out.println("Enter the number");
		for(i=0;i<3;i++) a[i]=sc.nextInt();
		int result=ab.method(a);
		System.out.println(result);
		sc.close();
		
	}

}

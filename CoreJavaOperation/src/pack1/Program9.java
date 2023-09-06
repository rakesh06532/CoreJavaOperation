package pack1;

import java.util.Scanner;

public class Program9 {
	public int method(int[] a)
	{
		int sum=0,i;
		for(i=0;i<3;i++)
		{
			if(a[i]<=0)return -1;
			if(a[i]%10<5) a[i]=a[i]/10*10;
			else a[i]=(a[i]/10+1)*10;
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int a[]=new int[3];
		int i;
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the number");
		for(i=0;i<3;i++) a[i]=abc.nextInt();
		Program9 ab=new Program9();
		System.out.println(ab.method(a));
		
		
	}

}

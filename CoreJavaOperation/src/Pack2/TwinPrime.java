package Pack2;

import java.util.Scanner;

public class TwinPrime {
	public float Prime(int a)
	{
		int i,j,count,sum=0;
		for(i=1;i<=a;i++)
		{
			int counter=0;
			
			for(count=0,j=1;j<=i;j++)
			
				if(i%j==0)count++;
			    if(i==2)continue;
				if(count==2)counter++;
				sum=sum+counter;
				
		}
		
		return (float)sum/2;
	}
	public static void main(String[] args) {
		TwinPrime obj=new TwinPrime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to check pairs of prime no");
		int a=sc.nextInt();
		float result=obj.Prime(a);
		System.out.println("The pairs of prime no is : "+result);
		sc.close();
	}

}

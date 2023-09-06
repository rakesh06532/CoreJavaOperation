package Com.pack2;

import java.util.Scanner;

public class Prime {
	public void Number(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		//for(int i=1;i<=num;i++)
		{
			
			if(num%i==0)
			{	
			//flag++;
			flag++;
			break;
			}
		}
		if(flag==0)
		//if(flag==2)
			System.out.println(num+" is a Prime number");
		else
			System.out.println(num+" is not a Prime number");
		
	}
	public static void main(String[] args) {
		Prime obj=new Prime();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to check is it Prime number : ");
		int num=sc.nextInt();
		obj.Number(num);
		sc.close();
		
	}

}

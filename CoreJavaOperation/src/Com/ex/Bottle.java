package Com.ex;

import java.util.Scanner;

public class Bottle {
	static int sum=0;
	public int sumOfCoin(int a)
	{
		//int sum=0;
		for(int i=1;i<=a;i++)
		{
			System.out.println("Bottle "+i+", "+ i+" Coin");
			sum=sum+i;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		Bottle obj=new Bottle();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of Bottles");
		int a=s.nextInt();
		int result=obj.sumOfCoin(a);
		System.out.print("Total coins: ");
		System.out.println(result);
		s.close();
		//System.out.println(10/0.0);
		
	}

}

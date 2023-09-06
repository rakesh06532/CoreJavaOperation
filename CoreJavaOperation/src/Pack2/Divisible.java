package Pack2;

import java.util.Scanner;

public class Divisible {
	public int Five(int a)
	{
		int count=0,counter=0;
		for(int i=1;i<=a;i++)
		{
		if(i%5==0)count++;
		}
		counter=counter+count;
		return counter;
	}
	public static void main(String[] args) {
		Divisible obj=new Divisible();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to divide by 5");
		int a=sc.nextInt();
		int result=obj.Five(a);
		System.out.println("The divisible of 5 count is : "+result);
		sc.close();
	}

}

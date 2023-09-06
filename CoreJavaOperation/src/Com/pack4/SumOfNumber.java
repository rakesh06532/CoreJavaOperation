package Com.pack4;

import java.util.Scanner;
public class SumOfNumber {
	public String Number(int a)
	{
		if(a==0||a<0)return "Error";
		else if(a%3==0&&a%5==0)return "FIZZBIZZ";
		if(a%3==0)return "FIZZ";
		else if(a%5==0)return "BIZZ";
		
		else return ""+a;
		
	}
	
	public static void main(String[] args) {
		SumOfNumber obj=new SumOfNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println(obj.Number(a));
		sc.close();
	}

}

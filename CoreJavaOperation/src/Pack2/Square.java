package Pack2;

import java.util.Scanner;

public class Square {
	public int PerfactSquare(int a)
	{
		int x,y,z;
		x=(int)Math.pow(a, 0.5);
		y=(int)Math.pow(x,2);
		z=(int)Math.pow(x+1,2);
		if(a-y>z-a) return z;
		return y;
	}
	public static void main(String[] args) {
		Square obj=new Square();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to return perfact square : ");
		int a=sc.nextInt();
		int result=obj.PerfactSquare(a);
		System.out.println(result);
		sc.close();
	}

}

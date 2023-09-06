package Pack2;

import java.util.Scanner;

public class getNumberofPen {
	
	public int Number(int a)
	{
		
		if(a>70) return 3;
		else if(a>=60 && a<=70) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		getNumberofPen obj=new getNumberofPen();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of percentage ");
		int a=sc.nextInt();
		int result=obj.Number(a);
		System.out.println(result);
		sc.close();
		
	}

}

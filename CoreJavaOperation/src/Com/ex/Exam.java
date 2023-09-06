package Com.ex;

import java.util.*;

public class Exam {
	public void calculate(int a,int b,char c)
	{
		switch(c)
		{
		case '+' : System.out.println(a+b);//ASCII value of +=43;
		           break;
		case '-' : System.out.println(a-b);//ASCII value of -=45
		           break;
		case '/' : System.out.println(a/b);//ASCII value of /=47
		           break;
		case '*' : System.out.println(a*b);//ASCII value of *=42
		           break;
		default : System.out.println("Wrong");
		}
		
	}
	public static void main(String[] args) {
		Exam obj=new Exam();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		char c=sc.next().charAt(0);
		obj.calculate(a,b,c);
		//System.out.println(result);
		sc.close();
		
	}

}

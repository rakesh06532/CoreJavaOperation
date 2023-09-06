package pack1;

import java.util.Scanner;

public class Program37 {
	public String method(int a1)
	{
		int a2=a1,a3=a1,rem;
		String st1="",st2="",st3="";
		while(a1>0)
		{
			rem=a1%2;
			st1=rem+" "+st1;
			a1=a1/2;
		}
		while(a2>0)
		{
			rem=a2%8;
			st2=rem+" "+st2;
			a2=a2/8;
		}
		while(a3>0)
		{
			rem=a3%16;
			if(rem>9){rem=55+rem;
			st3=(char)rem+" "+st3;}
			else st3=rem+" "+st3;
			a3=a3/16;
		}
		return "Binary number "+st1+'\n'+"Octal number "+st2+'\n'+"Hexadecimal number "+st3;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a1=abc.nextInt();
		Program37 ab=new Program37();
		System.out.println(ab.method(a1));
		abc.close();
	}

}

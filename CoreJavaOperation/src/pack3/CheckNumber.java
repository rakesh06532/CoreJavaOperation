package pack3;

import java.util.Scanner;
public class CheckNumber {
	public boolean meth(String a)
	{
		boolean s=true;
		for(int i=0;i<a.length()-1;i++)
		{
			if(a.charAt(i)>a.charAt(i+1))
			{
				s= false;
				break;
			}
			else s = true;
		}
		return s;
	}
	public static void main(String[] args) {
		CheckNumber obj=new CheckNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		String a=sc.next();
		boolean result=obj.meth(a);
		System.out.println("Output is : "+result);
		sc.close();
	}

}

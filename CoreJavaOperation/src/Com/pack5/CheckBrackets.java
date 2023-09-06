package Com.pack5;

import java.util.Scanner;
public class CheckBrackets {
	public boolean meth(String s)
	{
		int c1=0,c2=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				c1++;
			if(s.charAt(i)==')')
				c2++;
		}
		if(c1==c2)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		CheckBrackets obj=new CheckBrackets();
		System.out.println("Input brackets,numbers and words ");
		Scanner sc=new Scanner(System.in);
		System.out.println(obj.meth(sc.nextLine()));
		sc.close();
	}

}

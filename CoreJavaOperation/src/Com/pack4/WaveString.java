package Com.pack4;

import java.util.Scanner;
public class WaveString {
	public String Wave(String st1,String st2)
	{
		String st="";
		//char []ch=st1.toCharArray();
		
		if(st1.equals(st)&&(st2.equals(st)))
			return "-1";
		else if(st1.length()>st2.length())
			return st2+st1+st2;
		else if(st2.length()>st1.length())
			return st1+st2+st1;
		else
		{
			for(int i=0;i<st1.length();i++)
				st=st+st1.charAt(i)+st2.charAt(i);
		}
		return st;
	}
	public static void main(String[] args) {
		WaveString obj=new WaveString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Word : ");
		String s1=sc.nextLine();
		System.out.println("Enter second word : ");
		String s2=sc.nextLine();
		System.out.println(obj.Wave(s1,s2));
		sc.close();;
	}

}

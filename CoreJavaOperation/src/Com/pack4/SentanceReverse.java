package Com.pack4;

import java.util.Scanner;
public class SentanceReverse {
	public String word(String s)
	{
		String st="";
		String arr[]=s.split(" ");
		for(String st1:arr)
		{
			
		for(int i=st1.length()-1;i>=0;i--)
		{
			st=st+st1.charAt(i);
		}
		st=st+" ";
		
		}
		return st;
	}
	public static void main(String[] args) {
		SentanceReverse obj=new SentanceReverse();
		System.out.println("Enter any sentance : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(obj.word(s));
		sc.close();
//		String s="java is awesome";
//		String []arr=s.split(" ");
//		for(String s2:arr)
//		System.out.println(s2);
		
	}

}

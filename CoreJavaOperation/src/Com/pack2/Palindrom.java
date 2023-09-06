package Com.pack2;

import java.util.Scanner;
public class Palindrom {
	public void Check(String s)
	{
		String Reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			Reverse=Reverse+s.charAt(i);
		}
		if(Reverse.equalsIgnoreCase(s))
			System.out.println(Reverse+" is Palindrom");
		else
			System.out.println(Reverse+" is not a Palindrom");
	}
	public static void main(String[] args) {
		Palindrom obj=new Palindrom();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		obj.Check(s);
		sc.close();
	}

}

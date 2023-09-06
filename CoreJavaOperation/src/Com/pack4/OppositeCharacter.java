package Com.pack4;

import java.util.Scanner;
public class OppositeCharacter {
	public String Character(String s)
	{
		String Reverse="";
		int asc;
		for(int i=0;i<s.length();i++)
		{
			asc=s.charAt(i);
			if(asc>=97&&asc<=122)
			{
			asc=asc-96;
			asc=26-asc;
			asc=asc+97;
			Reverse=Reverse+(char)asc;
			}
			else
			{
				Reverse="Null";
			}
		}
		return Reverse;
	}
	public static void main(String[] args) {
		OppositeCharacter obj=new OppositeCharacter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word or Character : ");
		String s=sc.nextLine();
		System.out.println(obj.Character(s));
		sc.close();
		
		
	}

}

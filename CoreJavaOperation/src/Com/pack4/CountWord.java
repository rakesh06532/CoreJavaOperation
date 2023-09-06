package Com.pack4;

import java.util.Scanner;
public class CountWord {
	public int Word(String s)
	{
		int c=0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			
			if(((i>0 && s.charAt(i)!=' ')&&(s.charAt(i+1)==' '))||((s.charAt(0)!=' ')&& i==0))
				c++;
		}
		return c;
		//System.out.println(c);
	}
	public static void main(String[] args) {
		CountWord obj=new CountWord();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word ");
	
		System.out.println( obj.Word(sc.nextLine()));
		sc.close();
		
	}

}

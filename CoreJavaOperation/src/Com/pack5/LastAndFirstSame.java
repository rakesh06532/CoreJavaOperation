package Com.pack5;

import java.util.Scanner;
public class LastAndFirstSame {
	public void Word(String str)
	{
		int flag=0;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[0]==arr[arr.length-1])
				flag=1;
		}
		if(flag==1)
			System.out.println("First and last character are same and word is : "+str);
		else
			System.out.println("First and Last Character are not same ");
	}
	public static void main(String[] args) {
		LastAndFirstSame obj=new LastAndFirstSame();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word ");
		String s=sc.nextLine();
		String str=s.toLowerCase();
		obj.Word(str);
		sc.close();
	}

}

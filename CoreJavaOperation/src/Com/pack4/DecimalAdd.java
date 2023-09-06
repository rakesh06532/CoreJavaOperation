package Com.pack4;

import java.util.Scanner;
public class DecimalAdd {
	public void Add(String a)
	{
		int sum=0;
		char arr[]= a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			if(arr[i]>=48 && arr[i]<=57)
				sum=sum+arr[i]-48;
		}
		System.out.println("Count no of : "+sum);
	}
	public static void main(String[] args) {
		DecimalAdd obj=new DecimalAdd();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		String a=sc.nextLine();
		obj.Add(a);
		sc.close();
	}

}

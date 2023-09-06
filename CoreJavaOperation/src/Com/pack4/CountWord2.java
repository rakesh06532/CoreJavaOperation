package Com.pack4;

import java.util.Scanner;
import java.util.StringTokenizer;
public class CountWord2 {
	public void meth()
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		StringTokenizer obj2=new StringTokenizer(st);
		System.out.println(obj2.countTokens());
		sc.close();
	}
	public static void main(String[] args) {
		CountWord2 obj=new CountWord2();
		System.out.println("Enter sentance ");
		obj.meth();
		
	}

}

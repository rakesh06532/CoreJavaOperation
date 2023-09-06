package pack3;

import java.util.Scanner;
import java.util.StringTokenizer;
public class StringLine {
	void meth()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line of Text : ");
		String line=sc.nextLine();
		StringTokenizer st=new StringTokenizer(line);
		System.out.println("Number of Tokens = "+st.countTokens());
		sc.close();
		while(st.hasMoreTokens())
		{
			String token=st.nextToken();
			System.out.print(token+" ");
		}
	}
	public static void main(String[] args) {
		StringLine obj=new StringLine();
		obj.meth();
	}
}

package pack1;
import java.util.Scanner;
public class Program21 {
	
	public String method(int a)
	{
		int b=a;
	String st=""; int r,rev=0;
	if(a<0)st="-1";
	else if(a>=0 && a<=9)st="-2";
	else {
		while(a!=0)
	{
		r=a%10; rev=rev*10+r; a=a/10;
	}
		if(b==rev)st="true";
		else st="false";
	}
	return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program21 ab=new Program21();
		System.out.println("Enter the number");
		int a=abc.nextInt();                        abc.close();
		String result=ab.method(a);
		System.out.println(result);
	}
}

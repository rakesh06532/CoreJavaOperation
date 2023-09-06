package pack1;

import java.util.*;

public class Program32 {
	int st=1;
	public boolean method(int a)
	{
	for(int i=1;i<=a;i++)
	{
		st=st*2;
		if(st==a)break;
		
	}
	if(st==a) return true;
	
	else return false;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);	
		Program32 ab=new Program32();
		System.out.println("Enter the number");
		int a=abc.nextInt();
		boolean result=ab.method(a);
		System.out.println(result);
		abc.close();
	}

}

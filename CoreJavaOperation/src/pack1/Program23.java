package pack1;
import java.util.Scanner;
public class Program23 {
	public int method(int a)
	{
		int st=1;
		if(a<0)st= -1;
		else if(a==0)st= -2;
		else {
			for(int i=1;i<=a;a--)
			{
				st=st*a;
			}
			//return st;
		}
	return st;	
	}
	public static void main(String[] args) {
		    Scanner abc = new Scanner(System.in);
			Program23 ab=new Program23();
			System.out.println("Enter the number");
			int a=abc.nextInt();                           abc.close();
			int result=ab.method(a);
			System.out.println(result);
		}
		
	}



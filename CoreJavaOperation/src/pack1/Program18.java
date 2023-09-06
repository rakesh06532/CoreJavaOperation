package pack1;
import java.util.Scanner;
public class Program18 {
	String meth(int a)
	{
		String st="";
		if(a<0)return "-1";
		else if(a==0)return "-2";
		else {
			for(int i=1;i<=a;i++)
			{
				for(int j=1;j<=i;j++)
				{
					st=st+"* ";
				}
					st=st+"\n";
					}
			return st;
		}
		}
	public static void main(String[] args) {
		Program18 abc=new Program18();
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=ab.nextInt();                          ab.close();
		System.out.println(abc.meth(a));
	}

}

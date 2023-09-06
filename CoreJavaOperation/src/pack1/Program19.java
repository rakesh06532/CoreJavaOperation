package pack1;
import java.util.Scanner;
public class Program19 {
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
				st=st+i*j+" ";
			}
			st=st+"\n";
		}
		return st;
	  }
   }
	public static void main(String[] args) {
		Program19 ab=new Program19();
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int a=abc.nextInt();                               abc.close();
		System.out.println(ab.meth(a));
	}
}

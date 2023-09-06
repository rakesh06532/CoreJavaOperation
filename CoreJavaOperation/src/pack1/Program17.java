package pack1;
import java.util.Scanner;
public class Program17 {
	void meth(int a,int b)
	{
		
		if(a<0||b<0) System.out.println(-1);
		else if(a==0||b==0) System.out.println(-2);
		else {
			for(int i=1;i<=a;i++)
			{
				for(int j=1;j<=b;j++)
				{
					if(i==1||i==a||j==1||j==b)
					System.out.print("* ");	
					else System.out.print("  ");
				}
				System.out.print('\n');
			}
		}
	}
	public static void main(String[] args) {
		Program17 abc=new Program17();
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter row and column");
		int a=ab.nextInt();
		int b=ab.nextInt();                       ab.close();
		abc.meth(a,b);
	}

}

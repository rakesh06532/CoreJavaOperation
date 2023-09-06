package pack1;
import java.util.Scanner;
public class Prog15 {
	String meth(int a,int b,int c)
	{
		String s="";
		if(a<0 || b<0) return "-1";
		else if(a==b) return "-2";
		else if(a>b)return "-3";
		else {
			for(int i=a+c;i<b;i=i+c)
			{
				s=s+i+" ";}
				return s;
			}
		}
	
	 //s variable name
	public static void main(String[] args) {
		Prog15 aobj=new Prog15();
		Scanner ab=new Scanner(System.in);
		System.out.print("Enter a value ");
		int a=ab.nextInt();
		System.out.print("Enter b value ");
		int b=ab.nextInt();
		System.out.print("Enter increametn value ");
		int c=ab.nextInt();   ab.close();
		System.out.println(aobj.meth(a, b, c));
		
		
	}

}

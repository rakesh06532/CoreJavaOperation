package pack1;
import java.util.Scanner;
public class Program16 {
	
public String meth(int a)
{
	int count=1;
	String st="";
	if(a<0) return "-1";
	else if(a==0) return "-2";
	else if(a>99) return "-3";
	else {
		for(int i=a;i<=99;i++,count++)
		{
			st=st+i+" ";//U can write String.valueOf(i) in the place of i;
			if(count%4==0) st=st+'\n';
		}
		return st;
	}
	
}
public static void main(String[] args) {
	Program16 abc=new Program16();
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter a value");
	int a=ab.nextInt();                                     ab.close();
	System.out.println(abc.meth(a));
	
}
}

package pack1;


import java.util.Scanner;
public class Program20 {
	String meth(int a)
	{
		int i,count; String st="";
		if(a<0)st="-1";
		else if(a==0||a==1)st="-2";
		else {
		       for( i=1;i<=a;i++)
		       {
		    	   count=0;
		    	   for(int j=1;j<=i;j++)
		    	   if(i%j==0)count++;
		    		   {
		    			   if(count==2)
		    			   st=st+i+" ";
		    		   }
		       }
			}
		return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program20 ab=new Program20();
		System.out.println("Enter a value");
		int a=abc.nextInt();                                 abc.close();
		//System.out.println(ab.meth(a));
		String s=ab.meth(a);
		System.out.println(s);
		
	}

}

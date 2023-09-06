package pack1;
import java.util.Scanner;
public class Program17b {
     String meth(int a,int b)
     {
    	 String st="";
    	 if(a<0||b<0)return "-1";
    	 else if(a==0||b==0) return "-2";
    	 else {
    		 for(int i=1;i<=a;i++)
    		 {
    			 for(int j=1;j<=b;j++)
    			 {
    				 if(i==1||i==a||j==1||j==b) st=st+"* ";
    				 else st=st+ "  ";
    			 }
    			 st=st+'\n';
    		 }
    		 //return st;
    	 }
    	 return st;
     }
     public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Program17b ab=new Program17b();
		System.out.println("Enter no of rows");
		int a=abc.nextInt();
		System.out.println("Enter no of colomn");
		int b=abc.nextInt();                                         
		abc.close();
		System.out.println(ab.meth(a,b));
		
	}

}

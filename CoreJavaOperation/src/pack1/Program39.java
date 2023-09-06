package pack1;
import java.util.Scanner;
public class Program39 {
	public StringBuffer method(int n)
	{
		int rem;
		StringBuffer st=new StringBuffer("");
	    while(n!=0)
	    {
	    	rem=n%10;
	    	switch(rem)
	    	{
	    	case 0:st.insert(0, "Zero ");break;
	    	case 1:st.insert(0, "One ");break;
	    	case 2:st.insert(0, "Two ");break;
	    	case 3:st.insert(0, "Three ");break;
	    	case 4:st.insert(0, "Four ");break;
	    	case 5:st.insert(0, "Five ");break;
	    	case 6:st.insert(0, "Six ");break;
	    	case 7:st.insert(0, "Seven ");break;
	    	case 8:st.insert(0, "Eight ");break;
	    	case 9:st.insert(0, "Nine ");break;
	    	}
	    	n=n/10;
	    }
	    return st;
	}
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=abc.nextInt();
		Program39 ab=new Program39();
		System.out.println(ab.method(n));
		abc.close();
		
	}

}

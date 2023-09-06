package pack1;
import java.util.Arrays;
public class Class1 {
void meth1()
{
	System.out.println("meth1() called");
}
public static void main(String[] args) {
	Class1 aobj1=new Class1();
	Class1 aobj2=new Class1();
	int aobj1_hashCode=aobj1.hashCode();
	int aobj2_hashCode=aobj2.hashCode();        //hashCode();
	System.out.println("aobj1_hashCode is:" +aobj1_hashCode);
	System.out.println("aobj2_hashCode is:" +aobj2_hashCode);
	
	//equals();
	System.out.println(aobj1.equals(aobj2));
	System.out.println(aobj1.equals(aobj1));
	System.out.println(aobj2.equals(aobj2));
	System.out.println(new Class1().equals(new Class1()));
	
	//getClass();
	System.out.println("getClass():" +aobj2.getClass());
	System.out.println("getClass():" +aobj1.getClass());
	
	//toString();
	System.out.println("toString():" +aobj1.toString());
	System.out.println("toString():" +aobj2.toString());
	int arr[]= {10,20,30,40,50};
	System.out.println("Array data =>" +arr);
	System.out.println("Array data =>" +Arrays.toString(arr));
	//new Class1().meth1();
}
}

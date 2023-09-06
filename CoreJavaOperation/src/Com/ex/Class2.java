package Com.ex;

public class Class2 {
	int i; byte b; short s; long l; float f;
	double d; char c; boolean flag;
	void meth1()
	{
		System.out.println("Printing the default value of the 8 primitive datatype");
		System.out.println("int value"+i);
		System.out.println("byte value"+b);
		System.out.println("short value"+s);
		System.out.println("long value"+l);
		System.out.println("float value"+f);
		System.out.println("double value"+d);
		System.out.println("char value"+c);
		System.out.println("boolean value"+b);
		
	}
	void meth2()
	{
		int a=10; int b=20;int c=a+b;
		byte b1=10;byte b2=10; byte b3=(byte)(b1+b2);
		long x=2147483648L;
		float f=10.9f;
		System.out.println("c value "+c);
		System.out.println("b3 value "+b3);
		System.out.println("x value "+x);
		System.out.println("f value "+f);
	}
	public static void main(String[] args) {
		Class2 aobj=new Class2();
		aobj.meth1();
		System.out.println("-----------------");
		aobj.meth2();
	}

}

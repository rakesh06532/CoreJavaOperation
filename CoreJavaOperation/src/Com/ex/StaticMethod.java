package Com.ex;

public class StaticMethod {
	int a=10;//instance variable
	static int b=20;//static variable
	public void meth1()
	{
		
		int x=100;
		System.out.println("Instance variable: "+a);
		System.out.println("Static variable : "+b);
		System.out.println("Local variable : "+x);
	}
	StaticMethod()
	{
		System.out.println("Program Start");
	}
	public static void meth2()  //static method
	{
		System.out.println("meth2() called ");
		int y=20;
		System.out.println("Instance vaiable :"+new StaticMethod().a);//Accessing with the help of object creation.
		System.out.println("Static variable :"+b);
		System.out.println("Local variable :"+y);
		//System.out.println("Local variable "+x);
		
	}
	public static void main(String[] args) {
		StaticMethod aobj=new StaticMethod();
		aobj.meth1();
		System.out.println("---------------");
		aobj.meth2();//Accessing with the help of class object.
		System.out.println("----------------");
		meth2();//Accessing with the help of identifier name.
		System.out.println("-----------------");
		StaticMethod.meth2();//Accessing with the help of class name. 
	}

}

package Com.ex;

public class Class3 {
	int a=10;//Instance
	static int b=20;//static
	int x;
	static int y;
	void meth1()
	{
		int c=30;//local
		System.out.println("Instance variable:"+a);//by using identifier name
		//Class3 aobj=new Class3();
		//System.out.println("Instance variable:"+aobj.a);//by using class obj
		System.out.println("Instance variable:"+new Class3().a);
		System.out.println("--------------------------");
		System.out.println("static variable:"+b);//by using identifier name
		System.out.println("static variable:"+new Class3().b);//by using class obj
		System.out.println("static variable:"+Class3.b); //by using classname
		System.out.println("--------------------");
		System.out.println("Local variable:"+c);
	}
	void meth2()
	{
		
		System.out.println("Instance variable:"+x);
		System.out.println("Static variable:"+y);
		//System.out.println("Local variable:"+z);
	}
	void meth3()
	{
	int a=1000;
	int b=2000;
	System.out.println("Instance variable:"+new Class3().a);
	System.out.println("static variable:"+Class3.b);
	//System.out.println("static variable:");
	System.out.println("Local variable:"+a);
	System.out.println("Local variable:"+b);
	//System.out.println("Local variable:"+c);
	}
	
	public static void main(String[] args) {
		Class3 aobj=new Class3();
		aobj.meth1();
		System.out.println("-------------------");
		aobj.meth2();
		System.out.println("--------------------");
		aobj.meth3();
		
	}

}

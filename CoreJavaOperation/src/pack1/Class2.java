package pack1;

public class Class2 {
	void meth1()
	{
		System.out.println("meth1() called");
	}
	protected void finalize()
	{
		System.out.println("Garbage has been called");
	}
	public static void main(String[] args) {
		Class2 aobj1=new Class2();
		aobj1.meth1();
		aobj1=null;
		System.gc();//It is a way to call garbage collection.

	}

}

package Com.ex;

public class ThisClass {
	public int meth1(int a,int b)
	{
		System.out.println("Meth1() called");
		System.out.println(b);
		System.out.println(100);
		return (a+b)+10+(a-b);
	}
	public int meth2()
	{
		System.out.println("meth2() called");
		return this.meth3() +8;
	}
	public ThisClass()
	{
		this("Java is awesome");
		System.out.println(50);
	}
	int meth3()
	{
		System.out.println("meth3() called");
		return 10;
	}
	public String meth4(int a, String s)
	{
		System.out.println("Meth4() called");
		a=a+4;
		System.out.println("a value : "+a);
		System.out.println("s value : "+s);
		return s+"is object oriented programing language";
	}
	public int meth5(int a)
	{
		System.out.println("Meth5() called");
		return 10-a;
	}
	public ThisClass(String s)
	{
		String result=this.meth4(this.meth1(this.meth2(),this.meth5(5)+'A'-('a')), "java");
		System.out.println(result);
		System.out.println(s);
	}
	public static void main(String[] args) {
		new ThisClass();
	}

}

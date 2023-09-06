package Com.ex;

public class ClassB {
	int a=10;
	public String testmethod()
	{
		new ClassB(100,200,"java");
		System.out.println(40);
		return new ClassB().testmethod3(new ClassB(50).testmethod2())+new ClassB().testmethod4("hi");
	}
	ClassB()
	{
		System.out.println("Hi");
	}
	public int testmethod2()
	{
		System.out.println(50);
		return 10+15;
	}
	ClassB(int a)
	{
		System.out.println("Java is awesome");
	}
	public String testmethod3(int a)
	{
		System.out.println(18);
		return "is ";
	}
		ClassB(int a,int b, String s)
		{
			System.out.println(a+b);
			System.out.println(s);
		}
		
	public String testmethod4(String s)
	{
		System.out.println(88);
		return "good";
	}
	public static void main(String[] args) {
		ClassB t1=new ClassB();
		t1.a=10;
		ClassB t2=new ClassB(50);
		t2.a=30;
		System.out.println("java "+t1.testmethod()+" "+(t1.a+t2.a-30));
	}
}

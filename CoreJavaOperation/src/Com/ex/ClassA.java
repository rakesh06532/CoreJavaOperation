package Com.ex;

public class ClassA {
	public ClassA()
	{
		System.out.println("Sunday");
		ClassA obj=new ClassA(10);
		System.out.println("Tuesday");
	
	String s= obj.display("Challenge accepted");
	System.out.println(s);
	}
	public ClassA(int temp)//temp=10
	{
		System.out.println("Saturday");
		ClassA aobj=new ClassA(10,20);
		int a=aobj.meth1()+temp;//a=110
		System.out.println("==>"+(a+aobj.meth2()));
		System.out.println("Monday");
	}
	String display(String s)
	{
		System.out.println("In the first statement i am returning string value");
		return s;
	}
	int meth1()
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public ClassA(int data,int temp)//data=10,temp=20
	{
		System.out.println("Thursday");
		System.out.println("==>"+(data+new ClassA("Hi").meth2()-temp));
		
	}
	ClassA (String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		ClassA obj=new ClassA();
		System.out.println(obj.equals(obj));
		System.out.println("output varified");
	}
}

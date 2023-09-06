package Com.ex;

public class StaticVariableB {
	int a;
	static int b;
	StaticVariableB()
	{
		System.out.println("Instance variable: "+ ++a);
		System.out.println("static variable: "+ ++b);
	}
	public static void main(String[] args) {
		StaticVariableB abc=new StaticVariableB();
		System.out.println("----------------------");
		new StaticVariableB();
		System.out.println("-----------------------");
		new StaticVariableB();
		System.out.println("-----------------------");
		System.out.println(StaticVariableB.b);
		System.out.println(b);
		System.out.println(abc.b);
	}

}

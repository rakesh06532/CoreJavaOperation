package Com.ex;

public class StaticVariable {
	int a;
	static int b;
	StaticVariable()
	{
	System.out.println("Instance variable : "+ ++a);
	System.out.println("Static variable : "+ ++b);
	}
	public static void main(String[] args) {
		new StaticVariable();
		System.out.println("---------------------");
		new StaticVariable();
		System.out.println( "-------------------");
		new StaticVariable();
	}

}

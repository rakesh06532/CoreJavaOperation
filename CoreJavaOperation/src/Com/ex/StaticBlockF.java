package Com.ex;

public class StaticBlockF {
	static int x=m1();
	public static void main(String[] args) {
		System.out.println(StaticBlockF.x);
	}
	static
	{
		System.out.println(x);
		StaticBlockF.x=x+20;
	}
	static int m1()
	{
		System.out.println(x);
		StaticBlockF.x=50;
		System.out.println(x);
		return m2();
	}
	static int m2()
	{
		System.out.println(StaticBlockF.x);
		return 100;
	}

}

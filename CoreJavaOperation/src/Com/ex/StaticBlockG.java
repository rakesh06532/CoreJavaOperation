package Com.ex;

public class StaticBlockG {
	static int a=0;
	int b=0;
	StaticBlockG()
	{
		a++;
		b++;
		System.out.println("static variable ==>"+a);
		System.out.println("Instance variable ==> "+b);
		System.out.println("------------------");
		
	}
	void display()
	{
		System.out.println("****Accesing static variable******");
		System.out.println(StaticBlockG.a);
		System.out.println(a);
		System.out.println(new StaticBlockG().a);
	}

	public static void main(String[] args) {
		new StaticBlockG();
		new StaticBlockG();
		new StaticBlockG();
		System.out.println("###############");
		new StaticBlockG().display();
	}
}

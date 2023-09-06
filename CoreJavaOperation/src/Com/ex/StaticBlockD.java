package Com.ex;

public class StaticBlockD {
	static int x=10;
	public static void main(String[] args) {
		StaticBlockD t1=new StaticBlockD();
		StaticBlockD t2=new StaticBlockD();
		System.out.println(x);
		t1.x=20;
		System.out.println(x +" ");
		System.out.println(t2.x);
		System.out.println(t1.x);
		System.out.println(StaticBlockD.x);
		t1.meth();
	}
	public void meth()
	{
		int x=30;
		System.out.println(StaticBlockD.x);
		System.out.println(new StaticBlockD().x);
		System.out.println(x);
	}

}

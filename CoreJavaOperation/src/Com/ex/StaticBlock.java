package Com.ex;


public class StaticBlock {
	final static int x;
	static {
		x=50;
		System.out.println("1st static exucuted "+x);
	}
	public static void main(String[] args) {
		System.out.println("main() called :"+x);
	}
	static
	{
		System.out.println("2nd static block executed :"+x+10);
		System.out.println("2nd static block executed :"+(x+10));
	}

}

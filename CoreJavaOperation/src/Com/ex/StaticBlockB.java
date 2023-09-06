package Com.ex;

    public class StaticBlockB {
	static int i=StaticBlockB.meth1();
	static int meth1()
	{
		System.out.println("meth1() called");
		return 10;
	}
	static
	{
		System.out.println("1st static block : "+i++);
		
	}
	public static void main(String[] args) {
		System.out.println("main() excuted :"+ i++);
		
	}
	static
	{
		System.out.println("2nd static block :"+(++i));
	}

}

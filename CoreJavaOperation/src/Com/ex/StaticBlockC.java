package Com.ex;

public class StaticBlockC {
	int x=10;
	public static void main(String[] args) {
		int x=20;
		System.out.println(x);
		System.out.println(new StaticBlockC().x);
		
	}
	static 
	{
		int x=30;
		System.out.println(x+" ");
	}
}

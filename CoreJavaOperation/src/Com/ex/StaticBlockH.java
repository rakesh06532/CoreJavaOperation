package Com.ex;

public class StaticBlockH {
	int c;
	static int e;
	
	StaticBlockH()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) {
		int a=34;
		int b=21;
		
		new StaticBlockH().c  =a++ + ++b;
		
		int d=--a + --b +new StaticBlockH().c--;
		e=a + +b + new StaticBlockH().c +d--;
		int f= -a + b-- + -new StaticBlockH().c -d++;
		int sum=a+b+new StaticBlockH().c+d+e+f;
		System.out.println("sum= "+sum);
	}

}

package Com.ex;

public class Wraper2 {
	void meth1()
	{
		Integer ival=Integer.valueOf(100);
		int i1=ival;
		int i2=ival.intValue();
		System.out.println("Integer WCO : "+ival);
		System.out.println("int PDT : "+i1);
		System.out.println("int PDT : "+i2);
		
		Boolean bval=Boolean.valueOf("true");
		boolean flag=bval.booleanValue();
		System.out.println("Boolean WCO : "+bval);
		System.out.println("Boolean PDT : "+flag);
	}
	public static void main(String[] args) {
		new Wraper2().meth1();
	}

}

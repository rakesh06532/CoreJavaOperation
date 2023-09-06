package Com.ex;

public class Wraper {
	void meth1()
	{
		int i=10;
		Integer ival1=new Integer(i);//first way
		Integer ival2=i;//second way
		Integer ival3=Integer.valueOf(i);//Third way
		System.out.println("int PDT : "+i);
		System.out.println("Integer WCO "+ival1);
		System.out.println("Integer WCO "+ival2);
		System.out.println("Integer WCO "+ival3);
		System.out.println("---------------------");
		
		char c='A';
		Character cval=Character.valueOf(c);
		System.out.println("Char PDT : "+c);
		System.out.println("Charactor WCO : "+cval);
		System.out.println("--------------------");
		
		Byte bval =Byte.valueOf((byte)50);
		Integer ival4 =Integer.valueOf(100);
		Integer ival5 =Integer.valueOf("1000");
		//Integer ival6 =Integer.valueOf("Rakesh");
		System.out.println("-----------------");
		System.out.println("Byte WCO : "+bval);
		System.out.println("Integer WCO : "+ival4);
		System.out.println("Integer WCO : "+ival5);
		//System.out.println("Integer WCO : "+ival6);
		
		
	}
	public static void main(String[] args) {
		new Wraper().meth1();
	}

}

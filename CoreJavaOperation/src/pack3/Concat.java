package pack3;

public class Concat {
	public void meth()
	{
		String s="java";
		s=s.concat(" is awesome ");
		System.out.println(s); 
		System.out.println(s.concat("again"));
		System.out.println("again "+s);
	}
	public void meth2()
	{
		String s3="Java";
		String s1=new String("Java");
		String s2="Java";
		String s4=new String("Java");
		System.out.println(s1.equals(s2));
		System.out.println("java".equalsIgnoreCase("java"));
		System.out.println("----------------------------");
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s1==s4);
	}
	public String meth3(String name)
	{
		return "Hello ".concat(name).concat("! ");
	}
	public String meth4(String one,String two)
	{
		//return one.concat(two).concat(two).concat(one);
		return one+two+two+one;
	}
	public String meth5(String a,String b)
	{
		//return b.substring(0,2).concat(a).concat(b.substring(2,4));
		return b.substring(0,2)+a+b.substring(2,4);
	}
	public String meth6(String a)
	{
		String s=a.substring(a.length()-2);
		
		return s+s+s;
	}
	public String meth7(String name)
	{
		if(name.length()>=2)
		return name.substring(0,2);
		return name;
	}
	public static void main(String[] args) {
		Concat obj=new Concat();
//		obj.meth();
//		obj.meth2();
//		String result=obj.meth3("Bob");
//		System.out.println(result);
//		String result2=obj.meth4("Hi","Bye");
//		System.out.println(result2);
//		String result3=obj.meth5("out", "<<>>");
//		System.out.println(result3);
		//String result4=obj.meth6("Hello how are you");
		//System.out.println(result4);
		String result5=obj.meth7("");
		System.out.println(result5);
	}

}

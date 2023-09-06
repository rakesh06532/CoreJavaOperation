package Com.pack5;

public class Student {
	
	public void meth() {
	StringBuffer sobj=new StringBuffer("Rakesh");
	StringBuffer sobj2=new StringBuffer("Rakesh");
	String s=new String("Rakesh");
	String s2=new String("Rakesh");
	System.out.println(s.equals(s2));
	System.out.println(s==s2);
	System.out.println("===========================");
	System.out.println(s2.equals(s));
	System.out.println(sobj.equals(sobj2));
	StringBuilder obj3=new StringBuilder("Rakesh");
	StringBuilder obj4=new StringBuilder("Rakesh");
	System.out.println("===========================");
	System.out.println(obj3.equals(obj4));
	System.out.println(obj3==obj4);
	}
	public void meth2()
	{
		String s=new String("Rakesh");
		s.concat("Kumar");
		System.out.println(s);
//		System.out.println();
//		StringBuffer s2=new StringBuffer("Rakesh ");
//        s2.append("Kumar");
//		System.out.println(s2);
//		System.out.println();
//		StringBuilder obj=new StringBuilder("Rakesh");
//		obj.append(" Kumar");
//		System.out.println(obj);
	}
	public void meth3()
	{
		final StringBuffer sb=new StringBuffer("Rakesh");
		//sb.append(" Kumar");
		//sb.append(" saw");
		System.out.println(sb); 
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb2=new StringBuffer();
		sb2.append("RakeshRakeshRakesh");
		System.out.println(sb2.capacity());
		System.out.println(sb.charAt(sb.length()-1));
		StringBuffer sb3=new StringBuffer("Kumar");
		sb3.setCharAt(1, 'R');
		System.out.println(sb3);
	}
	public void meth4()
	{
		StringBuffer sb=new StringBuffer("Rakesh");
		sb.insert(2, "kumar");
		System.out.println(sb);
		sb.delete(2, 6);
		System.out.println(sb);
		sb.replace(1, 2,"L0000L");
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		Student obj=new Student();
		//obj.meth2();
		
//		String s="Rakesh Kumar";
//		System.out.println(s.substring(6));
//		String s1="This is index example";
//		int index1=s1.indexOf("is");
//		int index2=s1.indexOf("index");
//		System.out.println(index1);
//		System.out.println(index2);
		//obj.meth3();
		obj.meth4();
	}

}

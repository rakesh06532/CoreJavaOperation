package Com.ex;

public class ClassC {
	static String companyname="tata consultancy services";
	String empname;
	int empid;
	ClassC(String name, int id)
	{
		empname=name;
		empid=id;
	}
	public static void main(String[] args) {
		ClassC aobj1=new ClassC("kishan",101);
		ClassC aobj2=new ClassC("Rakesh",102);
		ClassC aobj3=new ClassC("Rahul",103);
		System.out.println("aobj1=>"+aobj1.empname+" "+aobj1.empid+" "+companyname);
		System.out.println("aobj2=>"+aobj2.empname+" "+aobj2.empid+" "+ClassC.companyname);
		System.out.println("aobj3=>"+aobj3.empname+" "+aobj3.empid+" "+aobj2.companyname);
	}

}

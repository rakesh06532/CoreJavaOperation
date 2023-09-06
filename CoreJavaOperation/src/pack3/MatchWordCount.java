package pack3;

public class MatchWordCount {
	public void meth(String s1,String s2)
	{
		int c=0;
		String a[]=s1.split(" ");
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i].equalsIgnoreCase(s2))
				c++;
		}
		System.out.println("\""+s2+"\""+" word found "+c+" time");
	}
	public static void main(String[] args) {
		MatchWordCount obj=new MatchWordCount();
		obj.meth("Java is object oriented programing language and Java","Java");
	}

}

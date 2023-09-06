package pack3;

public class WordCount {
	void meth(String s,String s2)
	{
		int c=1;
		String str[] = s.split("");
		for(int i=0;i<str.length;i++)
		{
		if(str[i].equals(s2))
			c++;
		}
		System.out.println("Total word of in this Sentence is : "+c);
	}
//	void meth2(String s)
//	{
//		int c=1;
//		char st[]=s.toCharArray();
//		for(int i=0;i<st.length;i++)
//		{
//			if(st[i]==" ")
//				c++;
//		}
//	}
	
	public static void main(String[] args) {
		WordCount obj=new WordCount();
		obj.meth("Java is object oriented  programing language and Java"," ");
		//obj.meth2("Java is object oriented programing");
	}

}
//char str[]=s.toCharArray();
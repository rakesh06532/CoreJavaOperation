package pack3;

public class WordChange {
	public void meth()
	{
		String st="my name is Rakesh";
		String s1=st.replace("is", "and");
		System.out.println(s1);
	}
	public static void main(String[] args) {
		WordChange obj=new WordChange();
		obj.meth();
	}

}

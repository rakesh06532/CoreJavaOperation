package pack3;

import java.util.Scanner;

public class ClassA {
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the word");
		String ab=abc.nextLine();
		StringBuilder st=new StringBuilder();
		st.append(ab);
		StringBuilder str=st.reverse();
		System.out.println(str);
		abc.close();
	}

}

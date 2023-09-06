package Pack2;
import java.util.Scanner;
public class Grade {
	public String Percentage(int a)
	{
		String grade=" ";
		switch(a)
		{
		default :
			if(a>=70)
				grade="A+ ";
		case 1:
			if(a>=60 && a<70)
				grade="A ";
		case 2:
			if(a>=50 && a<60)
				grade="B ";
		case 3:
			if(a<50)grade="C ";
			
		}
		return grade;
	}
	public static void main(String[] args) {
		Grade obj=new Grade();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter percentage of Student ");
		int a=sc.nextInt();
		String result=obj.Percentage(a);
		System.out.println("Grade of the Student is : "+result);
		sc.close();
	}

}

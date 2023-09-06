package Pack2;

public class SquareOfOddPictures {
	public void Picture(int a)
	{
		int square=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)square=square+i*i;
			
		}
		System.out.println("The square of odd rows picture is : "+square);
	}
	public static void main(String[] args) {
		SquareOfOddPictures obj=new SquareOfOddPictures();
		obj.Picture(10);
	}

}

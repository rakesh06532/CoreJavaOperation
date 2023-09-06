package Pack2;

public class CardAverage {
	 public float Average(int a)
	{
		int value=0;
		float average=0;
		for(int i=2;i<=a;i=i+2)
		{
			value=value+i;
			System.out.println(value);
			average=(float)value/a;
		}
		return average;
	}
	public static void main(String[] args) {
		CardAverage obj=new CardAverage();
		float result=obj.Average(100);
		System.out.println("Even average of given number : "+result);
	}
	
}

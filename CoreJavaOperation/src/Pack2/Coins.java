package Pack2;

public class Coins {
	public int getCoins(int a)
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			sum=sum+i;
			System.out.println(i+" Bottle "+","+i+" Coins");
		}
		return sum;
	}
	public static void main(String[] args) {
		Coins obj=new Coins();
		int result=obj.getCoins(20);
		System.out.println("Total no of Coins : "+result);
	}

}

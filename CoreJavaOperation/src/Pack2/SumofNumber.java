package Pack2;

public class SumofNumber {
	public int number(int a,int b,int c)
	{
		if(a<=0||b<=0||c<=0) return -1;
		int i,j,k;
		if(a%10==0) i=a;
		else a=((a/10)+1)*10; i=a;
		if(b%10==0) j=b;
		else b=((b/10)+1)*10;j=b;
		if(c%10==0) k=c;
		else c=((c/10)+1)*10;k=c;
		return i+j+k;
		
	}
	public static void main(String[] args) {
		SumofNumber obj=new SumofNumber();
		int result=obj.number(12,10,19);
		System.out.println("The sum of found : "+result);
	}

}

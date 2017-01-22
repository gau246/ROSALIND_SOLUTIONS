import java.util.Scanner;

class Fibo{
	public static int fibo(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter your input");
		Integer n=input.nextInt();
		//System.out.println(n);
		int temp= fibo(n);
		System.out.println(temp);

	}
}
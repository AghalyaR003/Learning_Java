import java.util.Scanner;
class test3 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int number=sc.nextInt();
		int power=sc.nextInt();
		int answer=1;
		for(int i=1;i<=power;i++)
		{
			answer*=number;
		}
			System.out.println(answer);

	}
	
}

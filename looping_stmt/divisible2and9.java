import java.util.*;
class  divisible2and9
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the start:");
		int start=sc.nextInt();
		System.out.print("enter the end:");
		int end=sc.nextInt();
		int sum=0;
		for (int i=start;i<=end ;i++ )
		{
			if (i%2==0 && i%9==0)
			{
				System.out.println(i);
				sum+=i;

			}
		}
		System.out.println("---------------------------------");
		System.out.println("sum:"+sum);
		
	}
}


//write a java program to sum the number bewteen 1 to 100 which is divisible 2 and 9

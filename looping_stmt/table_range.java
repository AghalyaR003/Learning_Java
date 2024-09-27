import java.util.*;
class  table_range    // line by line print
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the start value:");
		int start=sc.nextInt();

		System.out.print("enter the end value:");
		int end=sc.nextInt();

		for (int i=start;i<=end ;i++ )
		{
			for (int j=1;j<=10 ;j++ )
			{
				System.out.println(i+"X"+j+"="+(j*i));
			}
			System.out.println("-------------------------------");
		}
	}
}


//print the table in range
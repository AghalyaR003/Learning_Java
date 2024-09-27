import java.util.*;
class  table_print_row_by_row
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the start value:");
		int start=sc.nextInt();

		System.out.println("enter the end value:");
		int end=sc.nextInt();
		for (int i=1;i<=10 ;i++ )
		{
			for (int j=start;j<=end ;j++ )
			{
				System.out.print(i+"X"+j+"="+(i*j)+"\t");
			}
			System.out.println(" ");
		}
	}
}

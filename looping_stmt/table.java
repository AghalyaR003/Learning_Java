import java.util.*;
class table 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the values:");
		int n=sc.nextInt();
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(i+"X"+n+ "="+(i*n));
		}
	}
}

//print table where tabe need to be printed decided by user
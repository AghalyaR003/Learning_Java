import java.util.*;
class while_stmt 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the value");
		int n=sc.nextInt();
		int start=1;
		while(start<=n)
		{
			System.out.println(start);
			start++;
		}
		
	}
}
//print 1 to n where n is decided by user

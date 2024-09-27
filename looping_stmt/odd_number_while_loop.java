import java.util.*;
class odd_number_while_loop 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the value:");
		int n=sc.nextInt();
		int start=1;
		while (n>=start)
		{
			if (n%2!=0)
			{
				System.out.println(n);
				
			}
			n--;
		}
	}
}

//print the odd number in reverse order
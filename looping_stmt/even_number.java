import java.util.*;
class even_number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the value");
		int n=sc.nextInt();
		int start=1;
		while(start<=n)
		{
			if(start%2==0)
			{
			System.out.println(start);
			
			}
			start++;
		}
	}
}
// print the even number 


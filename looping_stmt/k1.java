import java.util.Scanner;
class k1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the start:");
		int start=sc.nextInt();
		System.out.print("enter the end:");
		int end=sc.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" -java");
			}
			if(i%2!=0)
			{
				sum+=i;
				System.out.println(i+" - odd");
				
			}
			System.out.println(sum);
		}
	}
}

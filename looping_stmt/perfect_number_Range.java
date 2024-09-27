import java.util.*;
class perfect_number_Range 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the start value");
		int start=sc.nextInt();

		System.out.println("enter the end value");
		int end=sc.nextInt();
		for (int i=start;i<=end;i++ )
		{
			int num=i;
			int sum=0;
			for (int j=1;j<num ;j++ )
			{
				if (num%i==0)
			{
				sum=sum+i;
			}
		}
		if (num==sum)
		{
			System.out.println(num+" is perfect");
		}
		else
		{
						System.out.println(num+" is not perfect");
		}
			}
			
			

		}

	}


// perfect number in range
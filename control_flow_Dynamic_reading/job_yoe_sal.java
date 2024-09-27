import java.util.*;
class job_yoe_sal
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter your gender answer in(m/f):");
		char gender=sc.next().charAt(0);
		System.out.print("enter your experience in previous work:");
		double yoe=sc.nextDouble();
		System.out.println("select your qualification\n1. post graduate\n2.graduate");
		int qualifi=sc.nextInt();
		if (gender=='m')
		{                  //all logics for male 
			if (yoe>=10 && qualifi==1)
			{
				System.out.println("give salary 15000");
			}
			else if (yoe>=10 && qualifi==2)
			{
				System.out.println(" give salary 10000");
			}
			else if (yoe<10 && qualifi==1)
			{	
				System.out.println(" give salary 10000");
			}
			else if (yoe<10 && qualifi==2)
			{	
				System.out.println(" give salary 7000");
			}
		}
		else
		{
			if (yoe>=10 && qualifi==1)
			{
				System.out.println(" give salary 12000");
			}
			else if (yoe>=10 && qualifi==2)
			{	
				System.out.println(" give salary 9000");
			}
			else if (yoe<10 && qualifi==1)
			{
				System.out.println(" give salary 10000");
			}
			else if (yoe<10 && qualifi==2)
			{	
				System.out.println(" give salary 6000");
			}
		}

	}
}

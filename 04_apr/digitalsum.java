import java.util.Scanner;
class digitalsum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\t Enter the number");
		int number=sc.nextInt();
		int sum=0;
		while(number>0)
		{
			sum+=number%10;
			number/=10;
		}
		System.out.println("Digital sum is:"+sum);
	}
}

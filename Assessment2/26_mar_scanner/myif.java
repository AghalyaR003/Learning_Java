import java.util.Scanner;
class  myif
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		int num=sc.nextInt();

		if (num==0)
		{
			System.out.println("css");
		}
		else
		if(num>0){
			System.out.println("java");
		}
		else
		{
		System.out.println("html");
		}
	}           
}

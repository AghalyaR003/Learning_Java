import java.util.Scanner;
class  cricket
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\tSelect the player");
		System.out.println("1.Dhoni\n2.Rohit\n3.Kohli");
		int player=sc.nextInt();
		if (player==1)
		{
			System.out.println("you have selected Dhoni");

		}
		if (player==2)
		{
			System.out.println("you have selected Rohit");

		}
		if(player==3)
		{
			System.out.println("you have selected Kohli");
		}

	}
}

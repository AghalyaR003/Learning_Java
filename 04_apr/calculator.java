import java.util.Scanner;
class calculator 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean repeat_operations=true;
		do
		{
			System.out.println("\t\t\t select the input");
			System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.exit");
			int input=sc.nextInt();
			switch(input)
			{
				case 1:{//Addition
					System.out.println("enter a:");
					int a=sc.nextInt();
					System.out.println("enter b:");
					int b=sc.nextInt();
					System.out.println("\t\t\t Addition of two is:"+(a+b));
					break;}
					case 2:{//subtraction
						
					System.out.println("enter a:");
					int a=sc.nextInt();
					System.out.println("enter b:");
					int b=sc.nextInt();
					System.out.println("\t\t\t Addition of two is:"+(a-b));
						break;}
					case 3:{//multiplication
						
					System.out.println("enter a:");
					int a=sc.nextInt();
					System.out.println("enter b:");
					int b=sc.nextInt();
					System.out.println("\t\t\t Addition of two is:"+(a*b));
						break;}
					case 4:{//division
						
					System.out.println("enter a:");
					int a=sc.nextInt();
					System.out.println("enter b:");
					int b=sc.nextInt();
					System.out.println("\t\t\t Addition of two is:"+(a/b));
						break;
					}
					case 5:{//exit
						repeat_operations=false;
						break;}
			}
//			System.out.println("******************************************");


		}
		while (repeat_operations);
					System.out.println("THANK YOU");


	}
}

import java.util.Scanner;
class  Skills
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		boolean repeat_my_feature=true;
		do{
		System.out.println("\t\t\t select the input");
		System.out.println("1.java\n2.sql\n3.exit");
		int input=sc.nextInt();
		switch(input)
			{
			case 1:		System.out.println("\t\t\t java by tabrez");
			break;
			case 2:		System.out.println("\t\t\t sql by bharath");
			break;
			case 3:	repeat_my_feature=false;
			break;
			}

			}while(repeat_my_feature);
				System.out.println("\t\t\t java by tabrez");
	}
}


import java.util.*;
class week_no_day 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter week details");
		int week_day=sc.nextInt();
		switch(week_day)
			{
			case 1:		System.out.println("monday");
			break;
			case 2:		System.out.println("tuesday");
						break;

			case 3:		System.out.println("wednesday");
			break;
			case 4:		System.out.println("thursday");		
			break;

			case 5:		System.out.println("friday"); 
			break;
 
		    case 6:		System.out.println("saturday");	
			break;


			case 7:		System.out.println("sunday");
		    break;

			default:System.out.println("happy weekend");
			}

	}
}

// write a java program to input is week number and print week days.use switch
import java.util.*;
class trainer_switch 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Select the Skills");
		System.out.println("1.Java\n2.SQL");
		int skill_selection=sc.nextInt();
		switch (skill_selection)
		{
	
		case 1:{ // java trainer selection
			System.out.println("select the java trainer");
			System.out.println("1.Tabrez\n2.shambu\n3.Nandini");
			int java_trainer=sc.nextInt();
			switch (java_trainer)
			{
			case 1:{System.out.println("your java is token by tabrez");
				break;}
			case 2:{
				System.out.println("your java is token by shambu");
				break;}
			case 3:{	System.out.println("your java is token by nandini");
			break;}
			default:{
				System.out.println("invalid java trainer selection");
			}
			}
			break;}
		case 2 :{ //sql trainer selection
			System.out.println("select the sqltrainer");
			System.out.println("1.bharath\n2.nagaraju\n3.neeraj");
			int sql_trainer=sc.nextInt();
			switch (sql_trainer)
			{
			case 1:{System.out.println("your sql is token by bharath");
				break;}
			case 2:{
				System.out.println("your sql is token by nagaraju");
				break;}
			case 3:{	System.out.println("your sql is token by neeraj");
			break;}
			default:{
				
					System.out.println("invalid sql trainer selection");
				
			break;}
		}
		
		

		
		
	}
	default:{
			System.out.println("invalid skill selection");
			break;
		}
}
}
}

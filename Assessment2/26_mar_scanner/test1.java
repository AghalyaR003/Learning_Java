import java.util.Scanner;
class test1 
{
	static int student_count=0;//10
	static int capacity=10;
	static Scanner sc=new Scanner(System.in);
	public static boolean addScanner(int student)//5,5,5
	{

		if((student_count+students)<=capacity){
			student_count+=students;
			return true;
		}
		return false;
	}
	public static boolean removeStudents(int students){
		if((student_count-students)<=capacity && (student_count-students)>0){
			student_count-=students;
			return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		boolean repeat=true;
		do
		{
			System.out.println("\t\t\tSelect the input");
			System.out.println("1.Add Student\n 2. Remove Student\n3.Exit");
			int input=sc.nextInt();
			switch(input)
			{
				case 1:{
					System.out.println("How Many students do you want to add");
					if(addStudents(sc.nextInt()))
						System.out.println("\t\t\tStudents added Students count:"+student_count);
					else
						System.out.println("\t\t\tclass room will be full");
					break;
		}
		case2:{
			System.out.println("how many Students do you want to remove");
			if(removeStudents(sc.nextInt()))
				System.out.println("\t\t\ttudents removed current students:"+Student_count);
			else
				System.out.println("\t\t\tclass room will be empty");
			break;}
			case 3:{
				repeat=false;
				break;}
			}
		}

		while (repeat);
			
		System.out.println("\t\t\t Thank you");
	}
}

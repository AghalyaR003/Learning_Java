import java.util.Scanner;
class mar292{
	static Scanner sc=new Scanner(System.in);
	public Static void main(String[]args){
		System.out.println("Enter your coursename: ");
		String course=sc.nextString();

		if(course=="java"){
			System.out.println("tabrez");
		}
		else if(course=="sql"){
			System.out.println("brath");
		}
		else if(course=="webtechnology"){
			System.out.println("harish");
		}
		else{
			System.out.println("go to join Course");
		}
	}

}
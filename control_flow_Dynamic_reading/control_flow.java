import java.util.*;
class control_flow  // first type decision marking stmt->type 1) if 2) if-else 3) else-if ladder 4) switch
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("details");
		if(5>3)     // if stmt
		{
			System.out.println("processing");

			if(10>2)   //if-else stmt                           
			{
		    	System.out.println("AB");
				if(5<2)   // else-if ladder stmt
				{
					System.out.println("cd");
				}
				else if(3>1)
				{
					System.out.println("ef");
					
				}
				else{
					System.out.println("gh");

				}

			}     //if-else stmt

			else{
				System.out.println("thank");

			}
		}  //if stmt
	}
}

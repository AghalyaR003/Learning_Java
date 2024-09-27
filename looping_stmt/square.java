import java.util.*;
class square 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      int number=5;
	  String ans="not a perfect square number";
	  for (int i=1;i*i=number ;i++ )
	  {
		  if (number%i==0 && number/i==i)
		  {
			  ans="perfect square  number";
			  break;
		  }
	  }
	  System.out.println(ans);
	}
}
// perfect square number

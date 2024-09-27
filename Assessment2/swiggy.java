import java.util.Scanner;
class swiggy
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)  throws Exception
	{

		System.out.println("\t\t\tWelcome to swiggy\n");
		System.out.println("\t\t\tSelect the hotel\n");
		System.out.println("1.buhari\n 2.A2B\n 3.ss\n");

		int hotel_selection=sc.nextInt();
		//  System.out.println("Your Selected Hotel is:"+hotel_selection);

		switch(hotel_selection){
			case 1://buhari
			{
				System.out.println("\t\t\twelcome to BUHARI");
				System.out.println("Select your Dish");
				System.out.println("1.dosa\n2.idli\n3.poori");
				System.out.println("\t\t\tselect the food");
				int food_selection=sc.nextInt();
				//System.out.println("your selected food is:"+food_selection);
				switch(food_selection){
					case 1://dosa
					{
						double price_per_plate=280;
						//need to ask quantity
						System.out.println("\t\t\t Enter the quantity...");
						int qty=sc.nextInt();
						System.out.println("\t\t\tProcessing......");
						double bill=qty*price_per_plate;
						System.out.println("Select the payment mode.\n\n");
						System.out.println("1.G-pay\n2.phone pay");
                        int payment_mode_selection=sc.nextInt(); 
						System.out.println("your selected food is:"+food_selection);
						switch(payment_mode_selection)
							{
							case 1:{//G-pay
								System.out.println("\t\t\t enter the amount:"+bill);
								double user_entered_amount=sc.nextDouble();
								if(bill==user_entered_amount)
								{
									//bill entered is correct
									//gen otp
									int sys_otp=(int)(math.random()*9999+9999);
									System.out.println("\t\t\t enter the otp:");
									thread.sleep(5000);
									int user_entered_otp=sc.nextInt();
									if(sys_otp==user_entered_otp)
									{
										//payment success
										System.out.println("\t\t\t payment successful....");
										thread.sleep(5000);
										System.out.println("\t\t\t order received & will be delivered by next year...");
									}
									else
									{
										System.out.println("payment is fail....");
									}
								}
								else
									{
									System.out.println(" bill entered is wrong...");
									}

								break;} // gpay complete
							case 2:{//phone pay
								System.out.println("\t\t\t enter the amount:"+bill);
								double user_entered_amount=sc.nextDouble();
								if(bill==user_entered_amount)
								{
									//bill entered is correct
									//gen otp
									int sys_otp=(int)(math.random()*9999+9999);
									System.out.println("\t\t\t enter the otp:");
									thread.sleep(5000);
									int user_entered_otp=sc.nextInt();
									if(sys_otp==user_entered_otp)
									{
										//payment success
										System.out.println("\t\t\t payment successful....");
										thread.sleep(5000);
										System.out.println("\t\t\t order received & will be delivered by next year...");
									}
									else
									{
										System.out.println("payment is fail....");
									}
								}
								else
									{
									System.out.println(" bill entered is wrong...");
									}

									break;}
									default:{
										System.out/println("\t\t invalid payment");
										break;
									}
						}

						break;
					}
					case 2://idli
					{
					    System.out.println("your selected food is:"+food_selection);

						break;
					}

					case 3://pori
					{
						System.out.println("your selected food is:"+food_selection);

						break;
					}
					default://invalid food
					{
					   System.out.println("invalid food selection");

						break;
					}

				}
				break;
			}
			case 2://a2b
			{
				System.out.println("\t\t\t welcome to A2B");
				System.out.println("1.chicken 65\n2.chicken briyani\n3.mutton briyani");
				System.out.println("\t\t\tselect the food");
				int food_selection=sc.nextInt();
				//System.out.println("your selected food is:"+food_selection);
				switch(food_selection){
					case 1://chicken 65
					{
						System.out.println("your selected food is:"+food_selection);

						break;
					}
					case 2://chicken briyani
					{
					    System.out.println("your selected food is:"+food_selection);

						break;
					}

					case 3://mutton briyani
					{
						System.out.println("your selected food is:"+food_selection);

						break;
					}
					default://invalid food
					{
					   System.out.println("invalid food selection");

						break;
					}

				}
				break;
			}
			case 3://ss
			{
				System.out.println("\t\t\twelcome to SS");
				System.out.println("1.briyani\n2.prawn briyani\n3.fish briyani");
				System.out.println("\t\t\tselect the food");
				int food_selection=sc.nextInt();
				//System.out.println("your selected food is:"+food_selection);
				switch(food_selection){
					case 1://briyani
					{
						System.out.println("your selected food is:"+food_selection);

						break;
					}
					case 2://prawn briyani
					{
					    System.out.println("your selected food is:"+food_selection);

						break;
					}

					case 3://fish briyani
					{
						System.out.println("your selected food is:"+food_selection);

						break;
					}
					default://invalid food
					{
					   System.out.println("invalid food selection");

						break;
					}

				}

			break;}

			default://invalid
			{
				System.out.println("invalild Hotel");

			}
		}
	}
}


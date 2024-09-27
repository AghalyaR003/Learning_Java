class test2 
{
	public static void main(String[] args) 
	{
		int number=-63;
		//String res=((number>0 || (number==0))?"positive number":"negative number");

        //            x           y     z   x1         y1              z1
        String res=((number==0)?"NPNG":(number>0)?"postive number":"negative number");
		System.out.println("the number"+number+"is "+res);
	}
}

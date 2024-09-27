class multiplication{
    public static void main(String[]args){
        double wallet=1600;
        System.out.println("wallet:"+wallet);

        double qty=3;
        System.out.println("qty:"+qty);

        double price=3000;

        double total=qty*price;
        System.out.println("total:"+total);

        double available_balance=wallet-total;
        System.out.println("available_balance:"+available_balance);

        

    }
}
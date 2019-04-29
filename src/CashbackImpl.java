public class CashbackImpl implements Cashback
{
    private double dbcashback=0;


    public double googlepaycashback(double amount)
    {
        if (amount >= 500)
        {
            dbcashback = dbcashback + amount + (20 * amount / 100);
            System.out.println("Total Amount in Wallet after GooglePay Cashback=" + dbcashback);
            return dbcashback;}
         else
        { System.out.println("Cashback cannot be applied as amount less than 500");
            return dbcashback;}

    }


    public double amazonpaycashback(double amount)
    {
        if(amount >= 1000)
        {    dbcashback=dbcashback+amount+(20 * amount/100);
            System.out.println("Total Amount in Wallet after Amazon Cashback = "+dbcashback);
            return dbcashback;}
        else
        {System.out.println("Cashback cannot be applied as amount less than 1000");
            return dbcashback;}
    }

}

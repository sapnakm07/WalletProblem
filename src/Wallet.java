public class Wallet
{
    private double netbalance=0;

    int TotalAmount=0;

    public void addMoney(Money amount)
    {
        netbalance=netbalance+amount.getValue();
        System.out.println(netbalance);
    }

    public boolean reduceMoney(Money amount)
    {
        if(netbalance<amount.getValue())
        return false;

        netbalance=netbalance-amount.getValue();
        System.out.println(netbalance);
         return true;



    }
    public double checkBalance()
    {return netbalance;
    }
}

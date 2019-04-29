public class Wallet
{
    private double netbalance=0;

    int TotalAmount=0;

    public void addMoney( double amount)
    {
        netbalance += amount;
        System.out.println(netbalance);
    }

    public void reduceMoney(double amount)
    {
        if(netbalance>amount)
        {
            netbalance -= amount;
            System.out.println(netbalance);
        }

    }

    public double checkBalance()
    {
        return netbalance;
    }
}

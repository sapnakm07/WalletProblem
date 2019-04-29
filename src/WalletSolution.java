import com.sun.source.tree.TryTree;

import java.util.*;


public class WalletSolution {

    public static void main(String[] args)
    {
        System.out.println("WalletMoney Problem");

        //Declarations
        double cashbackamountCalc;
        double amount;
        double amountReduce;

        String paymentType;

        Wallet mywallet = new Wallet();

        CashbackImpl cashback = new CashbackImpl();

        //Adding money to wallet
        Scanner inputamount = new Scanner(System.in);
        System.out.println("Please enter the amount you want to add to the wallet");
        amount = inputamount.nextDouble();

        mywallet.addMoney(amount);
        mywallet.addMoney(800);
        mywallet.addMoney(600);

        System.out.println(("Balance Amount After adding to the wallet " +mywallet.checkBalance()));


        //Making payment from the Wallet
        System.out.println("Please enter the amount you want to pay from the wallet");
        Scanner inputReduce = new Scanner(System.in);
        amountReduce= inputReduce.nextDouble();

        mywallet.reduceMoney(amountReduce);

        System.out.println("Balance Amount after the payment = "+mywallet.checkBalance());


        //GooglePay & AmazonPay
        System.out.println("Please enter the payment type : GooglePay or AmazonPay");

        Scanner inputpayment = new Scanner(System.in);
        paymentType= inputpayment.nextLine();

        try {
            if (paymentType.equalsIgnoreCase("")) throw new Exception();

            else if (paymentType.equalsIgnoreCase("GooglePay")) {
                cashbackamountCalc = cashback.googlepaycashback(mywallet.checkBalance());
            } else if (paymentType.equalsIgnoreCase("AmazonPay")) {
                cashbackamountCalc = cashback.amazonpaycashback(mywallet.checkBalance());
            }
        }catch (Exception e)
            {
            System.out.println(("3"));


            }

    }
}

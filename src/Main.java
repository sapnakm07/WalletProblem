public class Main {

    public static void main(String[] args){

        Wallet mywallet= new Wallet();
        System.out.println("Wallet Money Problem");

        mywallet.addMoney(new Money(50));
        mywallet.addMoney(new Money(300));

        System.out.println(("Balancecheck" +mywallet.checkBalance()));

        mywallet.reduceMoney(new Money( 50));
        mywallet.reduceMoney(new Money(60));
        System.out.println(("Balancecheck" +mywallet.checkBalance()));

    }
}

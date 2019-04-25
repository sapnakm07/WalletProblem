public class Money {

    private double value=0;

    private  String currency ="INR";

    Money(double amount){
        this.value=amount;
    }
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

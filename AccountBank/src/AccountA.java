public class AccountA {
    private String name;
    private double balance;
    public AccountA(String name, double balance){
        this.name= name;
        if (balance>0.0){
            this.balance=balance;
        }
    }
    public void deposit(double depositAmount){
        if (depositAmount>0.0){
            balance+=depositAmount;
        }
    }
    public void increment(double incrementAmount){
        if (incrementAmount>0.0){
            balance-=incrementAmount;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }
}

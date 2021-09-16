public class Conta {
    private int account;
    private String holder;
    private double balance;

    public Conta(int account, String holder, double initialDeposit) {
        this.account = account;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Conta(int account, String holder) {
        this.account = account;
        this.holder = holder;

    }

    public String toString(){
        return "Account :"
                + this.account
                + ", Holder: "
                + this.holder
                + " , Balance: $ "
                + String.format("%.2f",balance);
    }

    public int getAccount() {
        return account;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amout){
        this.balance +=amout;
    }

    public void withdraw(double amout) {
        double taxa = 5;
        this.balance -= (amout + taxa);
    }

}

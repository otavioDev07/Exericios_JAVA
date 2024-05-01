package poo.banco.entitie;

public class Account {
    private String holderName;
    private String ACCOUNT_NUMBER;
    private Double balance = 0.0;

    public Account(){}

    public Account(String holderName, String ACCOUNT_NUMBER, Double initialDeposit){
        this.holderName = holderName;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        deposit(initialDeposit);
    }

    public Account(String holderName, String ACCOUNT_NUMBER){
        this.holderName = holderName;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
    }

    public void deposit(Double valor){
        balance += valor;
    }

    public void withdraw(Double valor){
        balance -= (valor + 5.0);
    }
    public String toString(){
        return "Account "+ACCOUNT_NUMBER+", "+"Holder: "+holderName+", "+"Balance: $"+balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public Double getBalance() {
        return balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}

package poo.banco.entitie;

public class Account {
    private String holderName;
    private String ACCOUNT_NUMBER;
    private Double balance;
    private Double initialDeposit;

    public Account(){}

    public Account(String holderName, String ACCOUNT_NUMBER, Double initialDeposit){
        this.holderName = holderName;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.initialDeposit = initialDeposit;
    }

    public Account(String holderName, String ACCOUNT_NUMBER){
        this.holderName = holderName;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
    }

}

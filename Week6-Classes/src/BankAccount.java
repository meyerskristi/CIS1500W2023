public class BankAccount {

    // unique to each instance of BankAccount
    // instance attributes
    // class level attributes

    // private restricts access to the value to just the class code
    private String ownersName;
    private double balance;
    private double interestRate;

    // constructor is a special method made to 'create' the object
    // no return type specified
    // no STATIC keyword
    // name of the method matches the name of the class
    // the job of a Constructor is to give attributes values

    // default constructor accepts no arguments, just sets default values
    public BankAccount(){
        ownersName = "";
        balance = 0;
        interestRate = 0;
    }

    // parameterized constructor, has parameters to set values of attributes
    public BankAccount(String ownersName, double balance, double interestRate){
        this.ownersName = ownersName;
        this.balance = balance;
        setInterestRate(interestRate);
    }


    public void deposit(double amountToDeposit){
        if ( amountToDeposit > 0 ) {
            balance += amountToDeposit;
        }
        else {
            // please don't ever do this!!! classes shouldn't rely on console input or output
            System.out.println("Invalid deposit");
        }

    }

    public boolean withdraw(double amountToWithdraw){
        if ( amountToWithdraw > balance ){
            return false;
        } else{
            balance -= amountToWithdraw;
            return true;
        }
    }

    public String getOwnersName(){
        return ownersName;
    }

    public void setOwnersName(String ownersName){
        this.ownersName = ownersName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if ( balance < 0 ){
            this.balance = 0;
        } else{
            this.balance = balance;
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    // adds constraints or protections from invalid values
    public void setInterestRate(double interestRate) {
        if ( interestRate < 0 ){
            this.interestRate = 0;
        } else if ( interestRate >= 1 ){
            this.interestRate = interestRate / 100;
        } else{
            this.interestRate = interestRate;
        }
    }
}

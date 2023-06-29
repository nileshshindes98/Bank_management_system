package Bank1;

public class Account {
    //class variable
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    //constructor with parameter
     public Account(String accountNumber,String accountHolderNumber,double balance){
         this.accountNumber=accountNumber;
         this.accountHolderName=accountHolderNumber;
         this.balance= balance;
     }
// apply getter to show
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderNumber() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // adding method deposit and withdraw

    public void deposit(double amount){
         balance += amount;
        System.out.println("Deposit of "+ amount + " successful, Your new balance is : "+balance);
    }
    public void withdraw(double amount){
         balance-=amount;
        System.out.println("Withdraw of "+amount+ "successful, Your remaining balance is : "+balance);
    }

    //display the account details
    public void displayAccountDetails(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder : "+accountHolderName);
        System.out.println("Account balance : "+balance);
    }
}

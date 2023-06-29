package Bank1;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("123", "Nilesh",5000);
// adding deposit
        acc1.deposit(1000);
        System.out.println("updated account balance : ");
//display the recent account update
        acc1.displayAccountDetails();

    }
}

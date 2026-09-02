import java.util.Scanner;

class Bankaccount {
    String accountHolder;
    long accountNumber;
    String accountType;
    double balance;

    void displayDetails() {
        System.out.println("\n----- Bank Account Details -----");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bankaccount account = new Bankaccount();

        System.out.print("Enter Account Holder Name: ");
        account.accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        account.accountNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Type: ");
        account.accountType = sc.nextLine();

        System.out.print("Enter Balance: ");
        account.balance = sc.nextDouble();

        account.displayDetails();

        sc.close();
    }
}
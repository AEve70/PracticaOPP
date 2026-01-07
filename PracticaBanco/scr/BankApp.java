package PracticaOPP.PracticaBanco.scr;

import java.util.Scanner;

public class BankApp {
    BankAccount account;

    public BankApp(BankAccount account) {
        this.account = account;
    }

    public void start(){
        Scanner out = new Scanner(System.in);
        int option = 0;

        System.out.println("Welcome to the Bank App \nChoose an option: \n1.Deposit \n2.Withdraw \n3.Check Balance \n4.Exit");

        while(option != 4){
            option = out.nextInt();

            switch(option){
                case 1:
                    System.out.println("Enter amount to deposit:");
                    int depositAmount = out.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    int withdrawAmount = out.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println(account.getActualBalance());
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            if(option != 4){
                System.out.println("Choose an option: \n1.Deposit \n2.Withdraw \n3.Check Balance \n4.Exit");
            }
        }
    }
}

package PracticaOPP.PracticaBanco.scr;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Layla Fisher", 5000);
        BankApp bank = new BankApp(account);

        bank.start();
    }
}

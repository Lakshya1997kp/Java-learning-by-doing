import java.util.Scanner;
class Client {
    public static void main(String args[]){
        BankAccount bankaccount = new BankAccount(1115 , "Lakshya", 10000);
        System.out.println(bankaccount.getbalance());
        System.out.println(bankaccount.getinfo());
        bankaccount.withdraw(500.0);
        System.out.println(bankaccount.getbalance());
        BankAccount.changename("Yes bank");
        System.out.print(bankaccount.getinfo());
        
    }
}

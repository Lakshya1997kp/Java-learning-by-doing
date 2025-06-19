class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double  balance;
    private static String bankname="HDFC bank";
   public  BankAccount(int accountNumber , String accountHolderName, int balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        } 
    
    public double getbalance(){
        return balance;
    }

    public void deposite(double amount){
        this.balance=balance+amount;
    }

    public void withdraw(double amount){
        if (amount<= this.balance ){
            System.out.println("Successfully withdraw your amount!!");
            this.balance=balance-amount;
        }else{
            System.out.println("Insufficient amount!!");
        }
    }

    public static void changename(String name){
        BankAccount.bankname=name;
    }

    public String getinfo(){
        return "Name: "+this.accountHolderName+"  Bank: "+BankAccount.bankname;
    }



}
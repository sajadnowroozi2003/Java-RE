class BankAccount {

    String accountName;
    double blance;
    String bank;


    BankAccount(String accountName, double blance, String bank) {
        this.accountName = accountName;
        this.blance = blance;
        this.bank = bank;
    }


    void checkBlance(){
        System.out.println("Your blance is : "+blance);
    }

    void deposit (double amount){
        this.blance+=amount;
    }

    void withdraw(double amount){
        this.blance-=amount;
    }

    void show(){
        System.out.println("Your account name is "+accountName +" you have this amount in your account "+"and thank you for choosing "+bank+" Bank");
    }
}
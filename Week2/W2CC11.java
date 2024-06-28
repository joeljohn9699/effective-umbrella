// multilevel inheritance with super keyword.

class Account{
    String customerName;
    int accountNo;

    Account(String a, int b){
        customerName = a;
        accountNo = b;
    }

    void display(){
        System.out.println("The customer name is " +customerName);
        System.out.println("The account number is " +accountNo);
    }
}

class CurrentAccount extends Account{
    int currentBalance;

    CurrentAccount(String a, int b, int c){
        super (a, b);
        currentBalance = c;
    }

    void display(){
        super.display();
        System.out.println("The current balance is " +currentBalance);

    }
}

class AccountDetails extends CurrentAccount{
    int depositAmount, withdrawalAmount;

    AccountDetails(String a, int b, int c, int d, int e){
        super (a, b, c);
        depositAmount = d;
        withdrawalAmount = e;
    }

    void display(){
        super.display();
        System.out.println("The deposit amount is " +depositAmount);
        System.out.println("The withdrawal amount is " +withdrawalAmount);

    }
}

class W2CC11{
    public static void main(String[] args) {
        AccountDetails obj = new AccountDetails("Joel", 1141, 481, 10000, 500);
        obj.display();
    }
}
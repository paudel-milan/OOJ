// )Develop a Java program to create a class Bank that  maintains two kinds of account for its customers, one
// called savings account and the other current account. The savings account provides compound interest and
// withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no
// interest. Current account holders should also maintain a minimum balance and if the balance falls below this level,
// a service charge is imposed. Create a class Account that stores customer name, account number and type of account. From this derive the classes Cur-acct and Sav-acct to make them more specific to their requirements. Include the necessary methods in order to achieve the following tasks:
// a) Accept deposit from customer and update
// the balance.
// b) Display the balance.
// c) Compute and deposit interest
// d) Permit withdrawal and update the balance
// Check for the minimum balance, impose penalty if
// necessary and update the balance\


class Account{
    String customerName;
    String accNumber;
    String accType;
    int balance;

    Account(String customerName,String accNumber,String accType,int balance){
        this.customerName = customerName;
        this.accNumber = accNumber;
        this.accType = accType;
        this.balance = balance;
    }

    void  deposit(int amount){
        balance += amount;
        System.out.println("Deposited Amount: "+amount);
        System.out.println("Updated  Balance: "+balance);
    }

    void withdrawal(int amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=amount;
            System.out.println("Amount withdrawn from the acoount: "+amount);
            System.out.println("Updated Balance: "+balance);
        }
    }

    void  displayBalance(){
        System.out.println("Account Holder: "+customerName);
        System.out.println("Account Balance: "+balance);
    }

    void checkBookFacility(){
        if(accType.equals("Savings")){
            System.out.println("Sorry, Savings account does not have cheque book facility");
        }
        else{
            System.out.println("CheckBook Available.");
        }
    }
}

class savingAccount extends Account{
    int  interestRate;
    savingAccount(String customerName,String accNumber,String accType,int balance,int interestRate){
        super(customerName, accNumber, "Saving", balance);
        this.interestRate=interestRate;
    }
    void computeAndDepositInterest(){
        int interest=balance*interestRate/100;
        balance+=interest;
        System.out.println("Interest Earned: "+interest);
        System.out.println("Updated Balance: "+balance);
    }
    void withdrawal(int amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=amount;
            System.out.println("Amount withdrawn from the acoount: "+amount);
            System.out.println("Updated Balance: "+balance);
        }
    }
}

class currentAccount extends Account{
    int minimumBalance;
    int serviceCharge;
    currentAccount(String customerName,String accNumber,String accType,int balance,int minimumBalance,int serviceCharge){
        super(customerName, accNumber,"Current", balance);
        this.minimumBalance=minimumBalance;
        this.serviceCharge=serviceCharge;
    }

    void deposit(int amount){
        balance+=amount;
        System.out.println("Deposited Amount: "+amount);
        System.out.println("Updated Balance: "+balance);
        checkForMinimum();
    }

    void withdrawal(int amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=amount;
            System.out.println("Amount withdrawn from the acoount: "+amount);
            System.out.println("Updated Balance: "+balance);
            checkForMinimum();
        }
    }

    void checkForMinimum(){
        if(balance<minimumBalance){
            balance-=serviceCharge;
            System.out.println("Account Balance after imposing service charge: "+balance);
        }
    }

}

class Bank{
    public static void main(String[] args) {
        
        //create object for  saving account

        savingAccount s1=new savingAccount("Milan","123","Saving",5000,13);
        System.out.println("For Saving Account");
        s1.displayBalance();
        s1.computeAndDepositInterest();
        s1.deposit(1000);
        s1.withdrawal(2000);
        s1.checkBookFacility();
        s1.displayBalance();

        //create object for current account
        currentAccount c1=new currentAccount("Rahul","456","Current",100,2500,100);
        System.out.println("For Current Account");
        c1.displayBalance();
        c1.deposit(1000);
        c1.withdrawal(500);
        c1.displayBalance();



    }
}
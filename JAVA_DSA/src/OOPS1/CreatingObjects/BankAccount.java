package OOPS1.CreatingObjects;

class Account {
    int acc_no;
    String name;
    float amount;

//Method to initialize object  
    void insert(int a, String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }

    //depsoit method
    void deposit(float amt) {
    amount = amount +amt;
    System.out.println(amt + " deposited");
    }

    // withdraw method
    void withdraw(float amt){
        if (amount < amt) {
            System.out.println(" Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
    }
    //method to check balance of the Account
    void chechBalance(){
        System.out.println("Balance is: "+ amount);
    }
    // method to display the values of an object
    void display(){
        System.out.println(acc_no + " "+ name + " "+ amount);
    }

}


public class BankAccount {
 public static void main(String[] args) {
    Account a1 = new Account();
    a1.insert(3452106, "Siva", 100);
    a1.display();
    a1.chechBalance();
    a1.deposit(200);
    a1.chechBalance();
    a1.withdraw(20);
    a1.chechBalance();
 }
}
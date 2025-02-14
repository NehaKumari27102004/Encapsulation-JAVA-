public class BankAccount {

    //private feild
    private double balance;
    private String accountHolderName;

    //counstructor

    public BankAccount(String accountHolderName, double initialBalance)
    {
        this.accountHolderName= accountHolderName;

        if(initialBalance >=0)
        {
            this.balance=initialBalance;
        }
        else{
            this.balance=0;
        }
    }

//public setter and getter method

public double getBalance()
{
    return balance;
}

//public method to deposit  money

public void deposit(double amount)
{
    if (amount >0)
    {
        balance +=amount;
    }
}

//public method to withdraw money


public void withdraw(double amount)
{
    if(amount > 0 && balance >=amount){
        balance -=amount;
    }
}

//punlic method get account holder name
public String accountHolderName(){
    return accountHolderName;
}

//public method to set account holder name

public void setAccountHolderName(String accountHolderName)
{
    this.accountHolderName = accountHolderName;
}
    
}

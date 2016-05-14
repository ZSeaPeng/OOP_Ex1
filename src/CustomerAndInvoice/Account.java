package CustomerAndInvoice;

/**
 * Created by zseapeng on 2016/5/12.
 */
public class Account {
    private int id;
    private Customer customer;
    private double balance = 0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.customer.toString()+"balance="+this.balance+"";
    }
    public String getCustomerName(){
        return this.getCustomer().toString();
    }
    public Account deposit (double amount){
        this.balance = this.balance + amount;
        Account ac = new Account(this.id,this.customer,this.balance);
        return ac;
    }
    public Account withdraw(double amount){
        if (balance >= amount){
            this.balance -=amount;
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance");
        }
        Account ac = new Account(this.id,this.customer,this.balance);
        return ac;
    }
}

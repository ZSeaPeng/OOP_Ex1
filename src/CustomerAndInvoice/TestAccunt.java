package CustomerAndInvoice;

/**
 * Created by zseapeng on 2016/5/13.
 */
public class TestAccunt {
    public static void main(String[] args) {
        Customer customer = new Customer(233,"test",3);
        Account account = new Account(123,customer,34);
        System.out.println("getCustomer = "+account.getCustomer());
        System.out.println("getBalance= "+account.getBalance());
        System.out.println("toString"+account.toString());
        System.out.println("getCustomerName"+account.getCustomerName());
        Account ac = account.deposit(1.2);
        System.out.println("ac getBalance="+ac.getBalance());
        ac= account.withdraw(222.3);
        System.out.println("ac getBalance="+ac.getBalance());
    }
}

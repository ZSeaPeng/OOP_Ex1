package CustomerAndInvoice;

/**
 * Created by zseapeng on 2016/5/12.
 */
public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer(14211139,"zseapeng",8);
        c1.setDiscount(3);
        System.out.println(c1.toString());
        System.out.println(c1.getName());
        System.out.println(c1.getID());
        System.out.println(c1.getDiscount());
    }
}

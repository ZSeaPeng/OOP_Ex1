package CustomerAndInvoice;

/**
 * Created by zseapeng on 2016/5/12.
 */
public class TestInvoice {
    public static void main(String[] args) {
        Customer customer = new Customer(123,"qwe",3);
        Invoice invoice = new Invoice(12,customer,55);
        System.out.println("id: "+invoice.getID());
        System.out.println("Customer:"+invoice.getCustomer().toString());
        System.out.println("AmountAfterDiscount= "+invoice.getAmountAfterDiscount());
    }
}

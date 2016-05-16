package ex7;

import java.util.Date;

/**
 * Created by zseapeng on 2016/5/16.
 */
public class Visit extends DiscountRate{
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name,Date date){
        this.customer = new Customer(name);
        this.customer.setMemberType("Gold");
        this.date = date;

    }
    //public String getName(){
    //
    //}

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        double total = this.getProductExpense()*this.getServiceExpense()*getServiceDiscountRate(customer.getMemberType())
                *getProductDiscountRate(customer.getMemberType());
        return total;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}'+"\n"+"TotalExpense = "+getTotalExpense();
    }
}

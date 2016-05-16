package ex7;

/**
 * Created by zseapeng on 2016/5/16.
 */
public class DiscountRate {
    private double serviceDiscountPremium = 0.2;
    private double ServiceDiscountGold = 0.15;
    private double ServiceDiscountSilver = 0.1;
    private double productDiscountPremium = 0.1;
    private double productDiscountGold= 0.1;
    private double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type){
            if (type.equals("Premium")) {return serviceDiscountPremium;}
        else if (type.equals("Gold"))
            {return ServiceDiscountGold;}
        else if (type.equals("Silver")) {return ServiceDiscountSilver;}
        return 0;
    }
    public double getProductDiscountRate(String type){
            if (type.equals("Premium")) return productDiscountPremium;
        else if (type.equals("Gold")) return productDiscountGold;
        else if (type.equals("Silver")) return productDiscountSilver;
        return 0;
    }
}

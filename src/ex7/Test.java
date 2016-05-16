package ex7;

import java.util.Date;

/**
 * Created by zseapeng on 2016/5/16.
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        date.getTime();
        Visit visit = new Visit("TestName",date);
        visit.setServiceExpense(1000);
        visit.setProductExpense(20);
        System.out.println(visit.toString());
    }
}

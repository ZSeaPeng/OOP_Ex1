/**
 * Created by zseapeng on 2016/5/9.
 */
public class Ex1 {
    public static void main(String[] args) {
        OverLoads overLoads = new OverLoads();
        int[] num = {1,2};
        double[] doubles = {2.2,2.4};
        String[] strings = {"text","try"};
       overLoads.print(strings);
        overLoads.print(num);
        overLoads.print(doubles);
    }

}



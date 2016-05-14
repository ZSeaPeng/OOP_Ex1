/**
 * Created by zseapeng on 2016/5/9.
 */
public class OverLoads {
    public void print(String[] str) {
        for (int i=0;i<str.length;i++){
            System.out.print(str[i]+"   ");
        }
        System.out.println("");
    }
    public void print(int[] num) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+"   ");
        }
        System.out.println("");
    }
    public void print(double[] doubles) {
        for (int i=0;i<doubles.length;i++){
            System.out.print(doubles[i]+"   ");
        }
        System.out.println("");
    }
}

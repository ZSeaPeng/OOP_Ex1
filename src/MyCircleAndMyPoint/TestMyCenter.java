package MyCircleAndMyPoint;

/**
 * Created by zseapeng on 2016/5/11.
 */
public class TestMyCenter {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println("c1的半径是:"+c1.getRadius());
        System.out.println("c1的面积是:"+c1.getArea());
        MyCircle c2 = new MyCircle(3,4,5);
        System.out.println("c1,c2圆心的距离是:"+c1.distance(c2));
        MyCircle c3 = new MyCircle();
        c3.setCenterXY(3,4);
        c3.setRadius(1);
        int [] a = c3.getCenter().getXY();
        for (int e :a)
        System.out.println(e);
        System.out.println(c3.toString());
    }
}

package MyCircleAndMyPoint;

/**
 * Created by zseapeng on 2016/5/12.
 */
public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(1,2,3,4,5,6);
        System.out.println(r1.toString());
        System.out.println(r1.getPerimeter());
        MyPoint p1 = new MyPoint();
        p1.setXY(2,3);
        MyPoint p2 = new MyPoint();
        p2.setXY(4,5);
        MyRectangle r2 = new MyRectangle();
        r2.setV1(p1);
        r2.setV2(p2);
        r2.setTop_left(22);
        r2.setBottom_right(44);
        System.out.println(r2.toString());

    }
}

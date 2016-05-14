package MyPoint;

/**
 * Created by zseapeng on 2016/5/10.
 */
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint pp = new MyPoint(2,3);
        MyPoint p1 = new MyPoint(3,4);
        System.out.println(p1.distance(5,6));
        System.out.println(pp.toString());
        MyPoint p2 = new MyPoint(5,6);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());
        MyPoint[] points = new MyPoint[10];
        for (int i=0;i<points.length;i++){
            points[i] = new MyPoint();
            points[i].setXY(i+1,i+1);
            System.out.println(p1.distance(points[i]));
        }


    }
}

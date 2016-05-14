package MyCircleAndMyPoint;

/**
 * Created by zseapeng on 2016/5/11.
 */
public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        v1.setXY(x1,y1);
        v2.setXY(x2,y2);
        v3.setXY(x3,y3);
    }
    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                '}';
    }
    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }
    public String getTvde(){
        double s1 = v1.distance(v2);
        double s2 =v2.distance(v3);
        double s3 = v3.distance(v1);
        if (s1 == s2 && s2 == s3) return "Equilateral";
        else if (s1 == s2 || s1 == s3 || s2 == s3) return "Isosceles";
        return "Scalence";

    }
}

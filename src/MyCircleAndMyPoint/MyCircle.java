package MyCircleAndMyPoint;

/**
 * Created by zseapeng on 2016/5/11.
 */
public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle() {
    }

    public MyCircle(int x,int y,int radius) {
        this.radius = radius;
        center.setX(x);
        center.setY(y);
    }
    public MyCircle(MyPoint center,int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        int[] xy = new int[2];
        xy[0] = this.center.getX();
        xy[1] = this.center.getY();
        return xy;
    }
    public void setCenterXY(int x,int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }
    public double getArea(){
        double area = this.radius * this.radius *Math.PI;
        return area;
    }
    public double getCircumference(){
            return 2 * Math.PI * this.radius;
    }
    public double distance(MyCircle another){
        return this.center.distance(another.center);
    }
}

package MyCircleAndMyPoint;

/**
 * Created by zseapeng on 2016/5/12.
 */
public class MyRectangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private int top_left;
    private int bottom_right;
    public MyRectangle(){

    }
    public MyRectangle(int x1,int y1,int x2,int y2,int top_left,int bottom_right){
        v1.setXY(x1,y1);
        v2.setXY(x2,y2);
        this.top_left = top_left;
        this.bottom_right = bottom_right;
    }
    public MyRectangle(MyPoint v1, MyPoint v2,int top_left,int bottom_right){
        this.v1 = v1;
        this.v2 = v2;
        this.top_left = top_left;
        this.bottom_right = bottom_right;
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", top_left=" + top_left +
                ", bottom_right=" + bottom_right +
                '}';
    }
    public double getPerimeter(){
        return (this.top_left + this.bottom_right)*2;
    }

    public int getBottom_right() {
        return bottom_right;
    }

    public void setBottom_right(int bottom_right) {
        this.bottom_right = bottom_right;
    }

    public int getTop_left() {
        return top_left;
    }

    public void setTop_left(int top_left) {
        this.top_left = top_left;
    }

    public MyPoint getV1() {
        return v1;
    }

    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }
}

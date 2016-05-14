package MyPoint;

/**
 * Created by zseapeng on 2016/5/10.
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
        this.x = 0;
        this.y =0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] xy = new int[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }
    public double distance(int x,int y){
        double s = Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
        return s;
    }
    public double distance(MyPoint another){
        double s = Math.sqrt((another.x-this.x)*(another.x-this.x) + (another.y-this.y)*(another.y-this.y));
        return s;
    }
    public double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }

    @Override
    public String toString() {
        return "MyPoint("+x+","+y+")";
    }
}

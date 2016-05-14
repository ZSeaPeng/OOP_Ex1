package Set1;

/**
 * Created by zseapeng on 2016/5/10.
 */
public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 20;
        this.color = "red";
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        double area = this.radius * this.radius *Math.PI;
        return area;
    }
    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle：radius=" + radius+"  color=" + color;
    }
}

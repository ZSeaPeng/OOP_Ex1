package Set1;

/**
 * Created by zseapeng on 2016/5/10.
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toString());

        Circle c2 = new Circle(22);
        System.out.println("c2圆的半径是"+c2.getRadius());
        System.out.println("c2圆的面积是"+c2.getArea());
        System.out.println("c2圆的颜色是"+c2.getColor());

        Circle c3  = new Circle();
        c3.setRadius(5);
        c3.setColor("green");
        System.out.println("c3圆的半径是"+c3.getRadius());
        System.out.println("c3圆的面积是"+c3.getArea());
        System.out.println("c3圆的颜色是"+c3.getColor());

    }
}

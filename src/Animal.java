/**
 * Created by zseapeng on 2016/5/9.
 */
public class Animal {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println(name+"现在"+age+"岁了");
    }
}

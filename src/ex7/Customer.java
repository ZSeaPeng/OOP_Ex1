package ex7;

/**
 * Created by zseapeng on 2016/5/16.
 */
public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getMemberType() {
        return memberType;
    }

    public String getName() {
        return name;
    }
    public boolean isMember(){
        if (this.memberType.equals("Premium")||this.memberType.equals("Silver")
                ||this.memberType.equals("Gold")) return true;
        else return false;

    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + isMember() +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}

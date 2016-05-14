package AuthorAndBook;

/**
 * Created by zseapeng on 2016/5/10.
 */
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name="+name+",email="+email+"@somewhere.com,gender="+gender+"]";
    }
}

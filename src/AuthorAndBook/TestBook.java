package AuthorAndBook;

/**
 * Created by zseapeng on 2016/5/10.
 */
public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck","AhTeck",'m');
        authors[1] = new Author("Paul Tan","Paul",'m');

        Book javaDummy = new Book("Java for Dummy",authors,19.99,99);
        System.out.println(javaDummy);
    }

}

package lab2;

public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author("Mike", "mdmkns", 'm');
        Author a2 = new Author("Helen", "bjsfn", 'f');
        Author a3 = new Author("Bob", "nkcn", 'm');
        a3.setEmail("mscmdk");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}

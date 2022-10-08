public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("John","Denver");
        Author a2 = new Author("John","Denver");
        Book b1 = new Book("war and piece", a1, 2000);
        Book b2 = new Book("war and piece", a2, 2000);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(b2));
        System.out.println(a1.equals(a1));
        System.out.println(a1.equals(null));
        System.out.println(a1.equals(a2));

    }
}

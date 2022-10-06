public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("John","Denver");
        Author a2 = new Author("Will", "Smith");
        Book b1 = new Book("war and piece", a1, 2000);
        Book b2 = new Book("harry potter", a2, 1998);

        System.out.println("book 1: "+b1.getName()+" "+b1.getYear());
        System.out.println("author of book1 "+ a1.getName()+" "+a1.getSurname());
        b1.setYear(1234);
        System.out.println("book 1: "+b1.getName()+" "+b1.getYear());
        System.out.println("author of book1 "+ b1.getAuthor().getName()+" "+b1.getAuthor().getSurname());
    }
}

public class Book {
    private String name;
    private Author author;
    private int year;
    public Book(String name, Author author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    @Override
    public String toString(){
        String bookInfo;
        bookInfo = author.toString() +", "+ this.name+", "+this.year;
        return bookInfo;
    }
    @Override
    public boolean equals(Object other){
        Book otherBook = (Book) other;
        if (other == this) {
            return  true;
        }
        if (other == null || this.getClass()!= other.getClass()) {
            return false;
        }
        if (this.author.hashCode() != otherBook.getAuthor().hashCode()) {
            return false;
        } else {
            if (this.name == otherBook.getName() && this.author.equals(otherBook.getAuthor()) &&
                    this.year == otherBook.getYear()) {
                return true;
            } else {
                return false;
            }
        }

    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(name, author, year);
    }
}

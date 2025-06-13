package extends1.ex;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price); //?: 왜 private 썼는데 값 받는지
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + this.author + " , isbn: " + this.isbn);
    }
}

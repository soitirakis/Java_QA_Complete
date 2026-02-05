package Author;

public class Book {
    private String name;
    private int year;
    private Author author;
    private Double price;

    public Book (){

    }

    public Book(String name, int year, Author author, Double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Double  getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public Author getAuthor() {
        return this.author;
    }
}

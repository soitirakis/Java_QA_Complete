package Author;

public class Main {
    void main() {
        Author author = new Author("Andrei", "andrei@yahoo.com");

        System.out.println(author.getName());

        Book book1 = new Book("Fancy Name", 2025, author, 12.5);

        //Book details
        String bookName = book1.getName();
        Double bookPrice = book1.getPrice();
        int bookYear = book1.getYear();
        String authorName = author.getName();

        //Print book details
        System.out.println("Book: " + bookName + " price: " + bookPrice + " RON by " + authorName + ", published in " + bookYear);
    }
}

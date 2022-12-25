package pro.sky.java.ClassObjectHW;

public class Book {
    private String bookTitle;
    private int yearBook;
    private Author author;

    public Book(String bookName, int yearBook, Author author) {
        this.bookTitle = bookName;
        this.yearBook = yearBook;
        this.author = author;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
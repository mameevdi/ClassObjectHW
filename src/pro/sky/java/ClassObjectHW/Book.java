package pro.sky.java.ClassObjectHW;

import java.util.Objects;

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
    public String toString() {
        return "Название книги: " + this.bookTitle + ", год издания: " + this.yearBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, yearBook, author);
    }
}
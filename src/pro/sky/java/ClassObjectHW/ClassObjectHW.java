package pro.sky.java.ClassObjectHW;

public class ClassObjectHW {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Book otrochestvo = new Book("Отрочество", 1851, tolstoy);
        otrochestvo.setYearBook(1852);
        System.out.println("Название книги: " + otrochestvo.getBookTitle() + ". Год издания - " + otrochestvo.getYearBook() + ". Автор: " + tolstoy.getName() + " " + tolstoy.getSurname() + ".");
        Author gogol = new Author("Гоголь", "Николай");
        Book revizor = new Book("Ревизор", 1834, gogol);
        revizor.setYearBook(1835);
        System.out.println("Название книги: " + revizor.getBookTitle() + ". Год издания - " + revizor.getYearBook() + ". Автор: " + gogol.getName() + " " + gogol.getSurname() + ".");
    }
}
package pro.sky.java.ClassObjectHW;

public class ClassObjectHW {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Book otrochestvo = new Book("Отрочество", 1851, tolstoy);
        otrochestvo.setYearBook(1852);
        Author gogol = new Author("Николай", "Гоголь");
        Book revizor = new Book("Ревизор", 1834, gogol);
        revizor.setYearBook(1835);
        System.out.println(otrochestvo);
        System.out.println(tolstoy);
        System.out.println(revizor);
        System.out.println(gogol);
    }
}
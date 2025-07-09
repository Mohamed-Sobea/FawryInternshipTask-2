package test;
import model.*;
import service.*;


public class BookstoreFullTest {
    public static void main(String[] args){
        BookstoreManager manager = new BookstoreManager();

        // Add books (no author included)
        Book paper = new PaperBook(110, 2015, 100.0, "Fawry History", 10);
        Book ebook = new EBook(111, 2020, 120.0, "google History", "pdf");
        Book demo = new DemoBook(112, 2005, 30.0, "Egypt History");

        manager.addBook(paper);
        manager.addBook(ebook);
        manager.addBook(demo);

        System.out.println("\n--- Buy PaperBook ---");
        manager.buyBook(110, 2, "hoho@email.com", "Cairo, Egypt");

        System.out.println("\n--- Buy EBook ---");
        manager.buyBook(111, 1, "Abdo@gmail.com", "Alexendria");

        System.out.println("\n--- Try to Buy DemoBook ---");
        manager.buyBook(112, 1, "Khalid@hotmail.com", "Cairo , Nasr City");

        System.out.println("\n--- Remove Outdated Books ---");
        manager.remove(10, 2025);


    }
}

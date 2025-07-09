package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookstoreManager {
    private Map<Integer,Book> stock = new HashMap<>();

    public void addBook(Book book){
        stock.put(book.getIsbn(), book);
        System.out.println("Added book " + book.getTitle());
    }

    public double buyBook(int isbn, int quantity, String email, String address){
        Book book = stock.get(isbn);
        if (book == null){
            System.out.println("Book not found");
            return 0;
        }

        if (!book.isForSale()) {
            System.out.println("This book not for sale");
            return 0;
        }

        if (book instanceof PaperBook){
            //then type casting convert book to paperbook
            PaperBook pbook = (PaperBook) book;
            boolean enoughStock = pbook.reduceStock(quantity);
            if (!enoughStock){
                System.out.println("not enough books in stock");
                return 0;
            }
        }

        double total = book.getPrice() * quantity;
        book.deliver(email,address);
        return total;
    }


    public void remove(int currentyear , int maxyears){
        Iterator<Map.Entry<Integer, Book>> iterator = stock.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, Book> entry = iterator.next();
            Book book = entry.getValue();
            int age = currentyear - book.getYear();

            if (age > maxyears){
                System.out.println("Removed this outdated book :" + book.getTitle());
                iterator.remove();
            }
        }
    }
}

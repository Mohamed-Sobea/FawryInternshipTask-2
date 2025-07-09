package model;

public class DemoBook extends Book {


    public DemoBook(int isbn, int year, double price, String title) {
        super(isbn, year, price, title);
    }

    @Override
    boolean isForSale() {
        return false;
    }

    @Override
    void deliver(String email, String address) {
        throw new UnsupportedOperationException("Quantum book store: Showcase books are not for sale.");
    }
}

package model;

public abstract class Book {
        
    private int isbn , year;
    private double price;
    private String title;

    public Book(int isbn, int year, double price, String title) {
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.title = title;
    }

    abstract boolean isForSale();
    abstract void deliver(String email, String address);

    public int getIsbn() {
        return isbn;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public String getTitle() {
        return title;
    }

}

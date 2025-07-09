package model;

import service.ShippingService;

public class PaperBook extends Book{

    private int stock;

    public PaperBook(int isbn, int year, double price, String title , int stock) {
        super(isbn, year, price, title);
        this.stock = stock;
    }

    @Override
    boolean isForSale() {
        return true;
    }

    public int getStock(){
        return stock;
    }

    @Override
    void deliver(String email, String address) {
        ShippingService.ship(address);
    }

    public boolean reduceStock(int value){
        if (stock < value) {
            return false;
        } else {
            stock -= value;
            return true;
        }
    }
}

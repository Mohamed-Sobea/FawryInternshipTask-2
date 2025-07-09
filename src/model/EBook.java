package model;

import service.MailService;
import service.ShippingService;

public class EBook extends Book{

private String fileType;

    public EBook(int isbn, int year, double price, String title, String fileType) {
        super(isbn, year, price, title);
        this.fileType = fileType;
    }

    @Override
    boolean isForSale() {
        return true;
    }

    @Override
    void deliver(String email, String address) {
        MailService.sendMail(email);
    }

    String getFileType(){
        return fileType;
    }
}

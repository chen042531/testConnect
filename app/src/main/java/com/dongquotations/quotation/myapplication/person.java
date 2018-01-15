package com.dongquotations.quotation.myapplication;


public class person {
    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private double price;
    private int image;

    public person(int id, String title, String shortdesc, double rating, double price) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public  String getTitle() {
        return title;
    }

    public  String getShortdesc() {
        return shortdesc;
    }

    public  double getRating() {
        return rating;
    }

    public  double getPrice() {
        return price;
    }


}

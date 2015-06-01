package com.ccs.module2;

public class Book{
    String title;
    String author;
    double price;

    public Book(String title1, String author1, double price1){
        title = title1;
        author = author1;
        price = price1;
        
    }
    
    public static void main(String[] args){
        Book b2 = new Book("HP&SS", "JKR", 25.0);
        
    }
}
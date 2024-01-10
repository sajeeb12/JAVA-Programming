/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author sajeeb
 */
public class Book {
    private String name;
    private Author author;
    private double price;
    private int bookCount;
    
    Book(String name,Author author,double price, int bookCount){
        this.name = name;
        this.author = author;
        this.price = price;
        this.bookCount = bookCount;
    }
    
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public int getBookCount(){
        return this.bookCount;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setBookCount(int bookCount){
        this.bookCount = bookCount;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author sajeeb
 */
public class Test {
    public static void main(String[] args) {
        Author author = new Author("George R Martin","shantoislamsajeeb@gmail.com","Male");
        Book book = new Book("House of Dragon",author,250,1000);
        
        System.out.println("Name of the book: "+book.getName());
        System.out.println("Author of the book: "+book.getAuthor().getName());
        System.out.println("Email of the Author: "+book.getAuthor().getEmail());
        System.out.println("Price of the book: "+book.getPrice());
        System.out.println("Total Number of the book Available: "+book.getBookCount());
        
    }
}

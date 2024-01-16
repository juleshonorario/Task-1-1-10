public class Book{ 

    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) { 
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;  
    }

public void displayDetails() {
    System.out.println("Title: \"" + title + "\"");
    System.out.println("Author: \"" + author + "\"");
    System.out.println("Year Published: " + yearPublished);
    System.out.println("Price: $" + price);
    System.out.println();
    }
public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basic", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:");
        book1.displayDetails();

        System.out.println("Book 2:");
        book2.displayDetails();

        System.out.println("Book 3:");
        book3.displayDetails();
    }
}
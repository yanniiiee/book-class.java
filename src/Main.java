
public class Main {
    public static void main(String[] args) {
        // Creating objects using the default constructor
        Book book1 = new Book();
        book1.displayInfo();

        // Creating objects using the parameterized constructor
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 10.99);
        book2.displayInfo();

        Book book3 = new Book("1984", "George Orwell", "9780451524935", 8.99);
        book3.displayInfo();

        // Applying discount to book2
        System.out.println("\nApplying 20% discount to 'The Great Gatsby'...");
        book2.applyDiscount(20);
        book2.displayInfo();
    }
}
package W3Resource4;

public class Main {
    public static void main(String[] args) {
        Collectioon collection = new Collectioon();
        Book b1 = new Book("Pinnocio", "Bool","115479436");
        Book b2 = new Book("hello", "Bool","115479436");
        Book b3 = new Book("baby", "Bool","115479436");

        collection.addBook(b1);
        collection.addBook(b2);
        collection.addBook(b3);

        System.out.println(collection.getTotalNumberOfBooksInBookstore());

        System.out.println(collection.getBook(0));
        System.out.println(collection.getBook(1));
        System.out.println(collection.getBook(2));

        collection.removeBook(2);
        System.out.println(collection.getTotalNumberOfBooksInBookstore());



    }
}
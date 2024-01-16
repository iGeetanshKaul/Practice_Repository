package W3Resource4;

import java.util.ArrayList;

public class Collectioon {
    ArrayList<Book> bookstore = new ArrayList<Book>();

    public Collectioon(){

    }

    public void addBook(Book book){
        this.bookstore.add(book);
    }

    public Book getBook(int index){
        return this.bookstore.get(index);
    }

    public int getTotalNumberOfBooksInBookstore(){
        return this.bookstore.size();
    }

    public void removeBook(int index){
        this.bookstore.remove(index);
    }
}
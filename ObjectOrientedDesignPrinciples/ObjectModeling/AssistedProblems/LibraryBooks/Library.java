import java.util.ArrayList;
public class Library {
    private String name;
    private ArrayList<Book> books;
public Library(String name){this.name=name;this.books=new ArrayList<>();}
public void addBook(Book b){books.add(b);}
public void removeBook(Book b){books.remove(b);}
public ArrayList<Book> getBooks(){return books;}
public String toString(){return name+" -> "+books.toString();}
}

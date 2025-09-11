public class Main {
    public static void main(String[] args){
        Book b1=new Book("1984","Orwell");
        Book b2=new Book("Hamlet","Shakespeare");
        Book b3=new Book("Clean Code","Robert C. Martin");
        Library lib1=new Library("Central Library");
        Library lib2=new Library("Community Library");
        lib1.addBook(b1);
        lib1.addBook(b3);
        lib2.addBook(b2);
        lib2.addBook(b3);
        System.out.println(lib1);
        System.out.println(lib2);
        System.out.println(b3.getTitle()+" exists independently: "+b3.getAuthor());
    }
}

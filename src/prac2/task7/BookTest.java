package prac2.task7;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("A","A", "sci-fi", 1990);
        Book book2 = new Book("B","B", "detective", 1890);
        Book book3 = new Book("C","C", "fairy tale", 1990);
        BookShelf shelf = new BookShelf();
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);
        System.out.println(shelf.getLastByDate());
    }
}

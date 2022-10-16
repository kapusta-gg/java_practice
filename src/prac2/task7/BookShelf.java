package prac2.task7;

import java.util.ArrayList;
import java.util.Comparator;

public class BookShelf {
    private ArrayList<Book> shelf = new ArrayList<>();
    private int length = 0;

    public int getLength() {
        return length;
    }

    public BookShelf(){};

    public void addBook(Book book){
        this.shelf.add(book);
        this.length += 1;
    }

    public void sort(){
        Comparator<Book> compare_by_date = Comparator.comparing(Book::getWriting_date);
        shelf.sort(compare_by_date);
    }

    public Book getLastByDate(){
        int min_date = 2023;
        Book min_book = new Book();
        for (Book book:
             this.shelf) {
            if (book.getWriting_date() < min_date){
                min_book = book;
                min_date = book.getWriting_date();
            }
        }
        return min_book;
    }

    public Book getNewestByDate(){
        int max_date = 2023;
        Book max_book = new Book();
        for (Book book:
                this.shelf) {
            if (book.getWriting_date() < max_date){
                max_book = book;
                max_date = book.getWriting_date();
            }
        }
        return max_book;
    }
}

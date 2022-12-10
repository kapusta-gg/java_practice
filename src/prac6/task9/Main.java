package prac6.task9;

import prac6.task6.Printable;
import prac6.task7.Book;
import prac6.task8.Shop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> test = new ArrayList<>();
        test.add(new Book("3 лье под водой", "Книга о приключениях под водой"));
        test.add(new Shop("StopGame", "Игры"));
        for (Printable t: test) {
            t.print();
        }
    }
}

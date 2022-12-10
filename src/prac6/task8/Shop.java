package prac6.task8;

import prac6.task6.Printable;

public class Shop implements Printable {
    private String name;
    private String genre;

    public Shop(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    @Override
    public void print() {
        System.out.println("Книга " + this.name);
        System.out.println("Жанр :" + this.genre);
        System.out.println();
    }
}

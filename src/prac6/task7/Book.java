package prac6.task7;

import prac6.task6.Printable;

public class Book implements Printable {
    private String name;
    private String description;

    public Book(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public void print() {
        System.out.println("Книга " + this.name);
        System.out.println("Описание :" + this.description);
        System.out.println();
    }
}

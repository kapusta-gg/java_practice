package prac2.task7;

import java.beans.IntrospectionException;

public class Book{
    private String author;
    private String name;
    private String genre;
    private Integer writing_date;

    public Book(String author, String name,String genre, int writing_date){
        this.author = author;
        this.name = name;
        this.genre = genre;
        this.writing_date = writing_date;
    }

    public Book(){}

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getWriting_date() {
        return writing_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setWriting_date(int writing_date) {
        this.writing_date = writing_date;
    }
}

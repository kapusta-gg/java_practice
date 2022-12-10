package prac6.task3;

public class Human implements Nameable{
    private String name;

    public Human(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

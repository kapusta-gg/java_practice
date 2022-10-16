package prac2.task5;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int toHumanAge(){
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Возраст: " + age +
                ", Имя: " + name;
    }
}
